# ProyectoRedes
Requerimentos para ejecutar el FTPServer:

Maven-4.0.0 o superior

En caso de versión inferior debe agregar en el archivo de configuracion de maven  en la sección  <mirrors> lo siguiente:
```
<mirror>
                     <id>internal-repository</id>
                     <name>Maven Repository Manager running on https://repo1.maven.org/maven2</name>
                     <url>https://repo1.maven.org/maven2</url>
                     <mirrorOf>*</mirrorOf>
 <mirror>
```

CLIENTE:

Libreria: 
  Para ejecutar el cliente Primeramente hay que descargar la libreria commons net 3.6 se puede encontrar en el siguiente link:

  https://commons.apache.org/proper/commons-net/download_net.cgi
  
  ![alt text](https://i.ibb.co/5MSxHFN/Doc1.png)
  
  una vez descargado se tendrá un .zip como el siguiente que hay que desempaquetar
  
  ![alt text](https://i.ibb.co/qmRHY5G/Doc2.png)

  adentro de la carpeta veremos algo como esto
  
  ![alt text](https://i.ibb.co/26sBxsx/image.png)
  
  Luego, abrimos NetBeans y seleccionamos Abrir proyecto y nos dirijimos a la carpeta donde descargamos el proyecto y seleccionamos el proyecto del cliente y luego, lo abrimos
  
  ![alt text](https://i.ibb.co/L8pBqM0/cliente1.png)
  
  Una vez abierto, seleccionamos la carpeta librerias del proyecto en Netbeans y le damos click derecho, Agregar Jar/Folder y luego nos dirigimos a la carpeta donde tenemos el commons y seleccionmaos commons-net-3.6.jar
  
  ![alt text](https://i.ibb.co/m9HPzmm/add-jar.png)
  
  ![alt text](https://i.ibb.co/2twsjs9/add-jar-2.png)
  
  
  
