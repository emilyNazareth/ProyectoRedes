# ProyectoRedes
###### Descargar el Repositorio
Para obtener este repositorio debes descargarlo desde el botón código(code) y seleccionar descargar cómo zip

![descarga](https://i.ibb.co/p2bqDvq/descargar-repositorio.png)

Al descargarlo tendremos un .zip que debemos desempaquetar y adentro de la carpeta "ProyectoRedes - master" veremos los dos proyectos ClienteFtp y ServerFTP 

![descarga](https://i.ibb.co/hgBxm58/proyecto-zip.png)

![descarga](https://i.ibb.co/0hhyGRT/carpeta.png)

Ya con el proyecto descargado podemos abrir NetBeans y abrir un nuevo proyecto y seleccionar el ServerFTP de nuestra carpeta

![proy1](https://i.ibb.co/rpX5Lfx/nuevo-proyecto.png)

![proy2](https://i.ibb.co/WKDm6Vs/open-proyect.png)

Y está listo para ejecutarse el ServidorFTP. Maven descarga automáticamente las librerias necesarias. 
En el siguiente apartado ServerFTP se especifíca(en caso de errores) que version de Maven se necesita y como solucionarlo. 

Para Ejecutar el Cliente Revisa los pasos más abajo en el apartado ClienteFTP

## ServerFTP

Requerimentos para ejecutar el FTPServer:

Maven-4.0.0 o superior

En caso de versión inferior debe agregar en el archivo de configuracion de maven que se encuentra en donde está instalado Netbeans en este caso esta es la direccion(Pero puede variar si se cambia la direccion por defecto al instalar netbeans):
```
  C:\Program Files\NetBeans 8.2 RC\java\maven\conf
```
ahí encontraremos el archivo settings.xml que podemos abrir con un bloq de notas

![settings](https://i.ibb.co/MPnCJTq/settings-maven.png)

 Y en la sección  <mirrors> pegar lo siguiente como se ve en la imagen
```
<mirror>
                     <id>internal-repository</id>
                     <name>Maven Repository Manager running on https://repo1.maven.org/maven2</name>
                     <url>https://repo1.maven.org/maven2</url>
                     <mirrorOf>*</mirrorOf>
 <mirror>
```
![mirrors](https://i.ibb.co/t822468/mirros-maven.png)

## ClienteFTP:

Libreria JAR: 
  Para ejecutar el cliente se utiliza la libreria commons-net-3.6.jar de Apache, al descargar el proyecto desde github ya tiene el commons agregado en las librerias del proyecto pero es necesario volverla agregar, para ello hay que seguir los siguientes pasos.
  
  Primeramente hay que descargar la libreria commons net 3.6 se puede encontrar en el siguiente link:

  https://commons.apache.org/proper/commons-net/download_net.cgi
  
  ![alt text](https://i.ibb.co/5MSxHFN/Doc1.png)
  
  una vez descargado se tendrá un .zip como el siguiente que hay que desempaquetar
  
  ![alt text](https://i.ibb.co/qmRHY5G/Doc2.png)

  adentro de la carpeta veremos algo como esto
  
  ![alt text](https://i.ibb.co/26sBxsx/image.png)
  
  Luego, abrimos NetBeans y seleccionamos Abrir proyecto y nos dirijimos a la carpeta donde descargamos el proyecto y seleccionamos el proyecto del cliente y luego, lo abrimos
  
   ![alt text](https://i.ibb.co/Tvtkd3z/cliente2.png)
  
  Una vez abierto, aparecerá un mensaje de alerta porque el proyecto no ubica la librería, tenemos que solucionar el problema
  
  ![alt text](https://i.ibb.co/s19Xq6z/resolve-problems.png)
  
  A continuacion, veremos una ventana que te muestra el problema y damos click en resolver
  
  ![alt text](https://i.ibb.co/Rg9h1H2/resolve-problems2.png)
  
  En la siguiente ventana nos dirigimos a la carpeta donde tenemos el commons y seleccionmaos commons-net-3.6.jar
  
  ![add-jar2](https://i.ibb.co/ThBRzZn/commons2.png)
  
  Al final el proyecto debe verse así en Netbeans sin ningún error, listo para ejecutarse.
  
  ![Resultado](https://i.ibb.co/k0PhyHQ/image.png)
  
  
  
  
