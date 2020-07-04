# ProyectoRedes
###### Descargar el Repositorio
Para obtener este repositorio debes descargarlo desde el botón código(code) y seleccionar descargar cómo zip

![descarga](https://i.ibb.co/p2bqDvq/descargar-repositorio.png)

Al descargarlo tendremos un .zip que debemos desempaquetar y adentro de la carpeta "ProyectoRedes - master" veremos los dos proyectos ClienteFtp y ServerFTP 

![descarga](https://i.ibb.co/hgBxm58/proyecto-zip.png)

![descarga](https://i.ibb.co/0hhyGRT/carpeta.png)

## ServerFTP

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

## ClienteFTP:

Libreria JAR: 
  Para ejecutar el cliente se utiliza la libreria commons-net-3.6.jar de Apache, al descargar el proyecto desde github ya tiene el commons agregado en las librerias del proyecto pero puede ser no funcione así que habría que borrarla y volverla agregar para lo que hay que seguir los siguientes pasos.
  
  Primeramente hay que descargar la libreria commons net 3.6 se puede encontrar en el siguiente link:

  https://commons.apache.org/proper/commons-net/download_net.cgi
  
  ![alt text](https://i.ibb.co/5MSxHFN/Doc1.png)
  
  una vez descargado se tendrá un .zip como el siguiente que hay que desempaquetar
  
  ![alt text](https://i.ibb.co/qmRHY5G/Doc2.png)

  adentro de la carpeta veremos algo como esto
  
  ![alt text](https://i.ibb.co/26sBxsx/image.png)
  
  Luego, abrimos NetBeans y seleccionamos Abrir proyecto y nos dirijimos a la carpeta donde descargamos el proyecto y seleccionamos el proyecto del cliente y luego, lo abrimos
  
  ![alt text](https://i.ibb.co/L8pBqM0/cliente1.png)
  
  Una vez abierto, seleccionamos la carpeta librerias del proyecto en Netbeans y le damos click derecho, Agregar Jar/Folder y luego nos dirigimos a la carpeta donde tenemos el commons y seleccionmaos commons-net-3.6.jar
  
  ![add-jar](https://i.ibb.co/m9HPzmm/add-jar.png)
  
  ![add-jar2](https://i.ibb.co/2twsjs9/add-jar-2.png)
  
  Al final el proyecto debe verse así en Netbeans, Listo para ejecutarse.
  
  ![Resultado](https://i.ibb.co/k0PhyHQ/image.png)
  
  
  
  
