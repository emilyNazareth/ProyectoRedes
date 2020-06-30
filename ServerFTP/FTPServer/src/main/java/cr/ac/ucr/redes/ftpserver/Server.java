/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.cr.ac.ucr.redes.ftpserver;

/**
 *
 * @author emily
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ftpserver.FtpServer;
import org.apache.ftpserver.FtpServerFactory;
import org.apache.ftpserver.ftplet.Authority;
import org.apache.ftpserver.ftplet.FtpException;
import org.apache.ftpserver.ftplet.FtpReply;
import org.apache.ftpserver.ftplet.FtpRequest;
import org.apache.ftpserver.ftplet.FtpSession;
import org.apache.ftpserver.ftplet.Ftplet;
import org.apache.ftpserver.ftplet.FtpletContext;
import org.apache.ftpserver.ftplet.FtpletResult;
import org.apache.ftpserver.ftplet.UserManager;
import org.apache.ftpserver.listener.ListenerFactory;
import org.apache.ftpserver.usermanager.PasswordEncryptor;
import org.apache.ftpserver.usermanager.PropertiesUserManagerFactory;
import org.apache.ftpserver.usermanager.impl.BaseUser;
import org.apache.ftpserver.usermanager.impl.WritePermission;

public class Server {
    
    private static Server instance;
    
    private static FtpServer server;
    private static UserManager userManager;
    private int port = 21;
       
    
    public void setPort(int port) {
        this.port = port;
        
    }
            
    /**
     * 
     * @return 
     */
    public static Server getInstance() {
        if (instance == null) {
            instance = new Server();
        }
        return instance;
    }        

    /**
     * 
     */
    private Server() {
        FtpServerFactory serverFactory = new FtpServerFactory();
        ListenerFactory factory = new ListenerFactory();

        factory.setPort(port);
        serverFactory.addListener("default", factory.createListener());
        
        PropertiesUserManagerFactory userManagerFactory = 
                new PropertiesUserManagerFactory();
        userManagerFactory.setFile(new File("myusers.properties"));
        userManagerFactory.setPasswordEncryptor(new PasswordEncryptor() { 
            @Override
            public String encrypt(String password) {
                return password;
            }

            @Override
            public boolean matches(String passwordToCheck, 
                    String storedPassword) {
                return passwordToCheck.equals(storedPassword);
            }
        });
        
        userManager = userManagerFactory.createUserManager();
        serverFactory.setUserManager(userManager);
        
        Map<String, Ftplet> m = new HashMap<>();
        m.put("miaFtplet", new Ftplet() {
            @Override
            public void init(FtpletContext ftpletContext) throws FtpException {
                System.out.println("FTP Server started.");
            }

            @Override
            public void destroy() {
                System.out.println("FTP Server shutdown.");
            }

            @Override
            public FtpletResult beforeCommand(FtpSession session, 
                    FtpRequest request) throws FtpException, IOException {
                
                System.out.println("beforeCommand " + session.getUserArgument()
                + " : " + session.toString() + " | " + request.getArgument() 
                + " : " + request.getCommand() + " : " + request.getRequestLine());

                
                return FtpletResult.DEFAULT;
            }

            @Override
            public FtpletResult afterCommand(FtpSession session, 
                    FtpRequest request, FtpReply reply) 
                    throws FtpException, IOException {             
                return FtpletResult.DEFAULT;
            }

            @Override
            public FtpletResult onConnect(FtpSession session)
                    throws FtpException, IOException {
                System.out.println("User connection attempt.");
                System.out.println("Username: " + session.getUser());
                System.out.println("Session: " + session.toString());            
                return FtpletResult.DEFAULT;
            }

            @Override
            public FtpletResult onDisconnect(FtpSession session)
                    throws FtpException, IOException {
                
                return FtpletResult.DEFAULT;
            }
        });
        serverFactory.setFtplets(m);
        server = serverFactory.createServer();
    }
    
    public void addUser(String userName, String password) {
        BaseUser user = new BaseUser();
        String desktopPath = System.getProperty("user.home") + "/Desktop";
        String folder = desktopPath + "./ftp/" + userName;
        user.setName(userName);
        user.setPassword(password);
        user.setHomeDirectory(folder);

        List<Authority> authorities = new ArrayList<>();

        authorities.add(new WritePermission());
        user.setAuthorities(authorities);
        
        try {
            userManager.save(user);
            File file = new File(folder);
            file.mkdirs();
        } catch (FtpException e) {
            e.printStackTrace();
        }
    }
    
    public void start() throws FtpException {
        server.start();
    }
    
    public void stop() {
        server.stop();
    }
            
}
