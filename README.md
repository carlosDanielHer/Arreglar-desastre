# TechCare® v1.0.0

## Descripción
 TechCare es una aplicación que permite la gestión efectiva de los negocios encargados del mantenimiento
 y reparación de equipos electrónicos, este sistema permite:

    1. Registrar Usuarios que usen el sistema.
    2. Gestionar Usuarios.
    3. Actualizar la información de los Usuarios.
    4. Registrar Clientes.
    5. Gestionar Clientes.
    6. Actualizar la Información de los Clientes.
    7. Registrar Equipos.
    8. Gestionar Equipos.
    9. Actualizar información de los equipos.

## Instalación
 Para el uso de la aplicación TechCare existen tres opciones, usar el instalador para Windows, usar el 
 archivo .jar y compilar/empaquetar todo el proyecto desde el repositorio de GitHub.

### Uso del Instalador de Windows
 En el repositorio de GitHub (https://github.com/carlosDanielHer/TechCare ) hay un instalador (**TechCare_Windows_Installer_v1.0.0**) que se puede usar para instalar,
 valga la redundancia, el sistema TechCare en una computadora con Windows.

#### Requisitos Previos
- Windows 10 o superior de 32 o 64 bits.

#### Instrucciones de Instalación
 Siga las siguientes instrucciones para instalar la aplicación en su computadora:

    1. Ir al repositorio desde su navegador usando el siguiente URL anterior.
    2. Descargar el instalador (TechCare_Win_Installer-v1.0.0).
    3. Dar clic en el instalador y conceder permisos de Administrador.
    4. Seguir las instrucciones.
    5. Para más información sobre cómo usar la aplicación, revise el manual de uso:

 El manual está en el siguiente enlace: https://github.com/carlosDanielHer/TechCare/blob/main/docs/Manual%20de%20Uso%20TechCare.pdf

### Uso del Archivo .jar
 En el repositorio de GitHub (https://github.com/carlosDanielHer/TechCare ) hay un archivo .jar (TechCare-v1.0.0-jar) que se puede utilizar para 
 usar la aplicación, en este caso, la aplicación funcionará de manera portable y podrá ser usada en varios sistemas
 operativos si cumple con los requisitos mínimos.

#### Requisitos Previos

- Sistema Operativo para arquitecturas de 32 bits o 64 bits.
- Tener instalado en su sistema operativo Java 21 (JDK 21) o superior (x86 o x64).

#### Instrucciones de Uso
 Siga las siguientes instrucciones para usar la aplicación mediante el .jar en su computadora:

    1. Ir al repositorio desde su navegador.
    2. Descargar el .jar (TechCare-v1.0.0-jar).
    3. Dar clic en el .jar y usar la aplicación.
    4. Para más información sobre cómo usar la aplicación, revise el manual de uso:
       
 El manual está en el siguiente enlace: https://github.com/carlosDanielHer/TechCare/blob/main/docs/Manual%20de%20Uso%20TechCare.pdf

### Construcción desde el código fuente
 Puede construir el proyecto para su uso desde el código fuente del repositorio de GitHub, para esto siga las 
 siguientes instrucciones y requisitos.

#### Requisitos Previos

- Tener instalado en su sistema operativo Java 21 (JDK 21) o superior (x64 o x86).
- Tener Maven instalado en su sistema operativo.
- Tener git instalado en su sistema operativo.

#### Instrucciones de Uso
 Siga las siguientes instrucciones para construir el proyecto desde el código fuente:

  1. Clona el repositorio de GitHub a tu computadora.
     ```
     git clone https://github.com/carlosDanielHer/TechCare.git
     ```
  2. Navega hasta el proyecto, a la carpeta raíz del proyecto.
     ```
     cd ruta/TechCare
     ```
  3. Luego compilar y empaquetar el proyecto, esto generará un archivo .jar con todas las dependencias y recursos
     dentro.
     ```  
      mvn clean package
     ```
4. Para ejecutarlo solamente puede dar clic sobre el jar y listo.
5. Para mas informacion sobre como usar la aplicacion, revise el manual de uso: 
   https://github.com/carlosDanielHer/TechCare/blob/main/docs/Manual%20de%20Uso%20TechCare.pdf

### Estructura del proyecto
En esta primera version, el proyecto esta desarrollado con una arquitectura monolitica con un fuerte acoplamiento
donde la logica de negocio esta dentro de las clases de las interfaces graficas. Esta arquitectura puede hacer 
problematico la labor de matenimiento del sistema. En versiones posteriores se ira refactorizando el codigo para 
hacerlo mas modular y mantenible. A continuacion se presenta una respresentacion resumida de la arquitectura del
proyecto:

#### Descripción de Archivos Clave
- `TechaCare`: Carpeta raiz del proyecto.
- `docs`: Carpeta donde esta la documentacion del proyecto (requerimientos, manual de instruciones).
- `src/main/java/ve/techcare/**`: Implementación del codigo fuente.
- `src/main/resources/**`: Carpeta donde estan los recursos (imagenes, base de datos, archivos para repostes).
- `test/java/ve/techcare`: Carpeta para la implementacion de las pruebas, en esta version no se implementaron.
-  `.gitignore`: Archivo donde se especifica a git cuales son las carpetas y archivos que debe ignorar.
-  `pom.xml`: Archivo donde se especifican las dependencias de proyecto y la configuracion para Maven.

En `src/main/java/ve/techcare/**` hay dos paquetes `**/servicios/utilidades/**` el cual contienes la Clase que establece
la conexion con la base de datos y `**/vistas/**` el cual contienes todas las clases que crean las ventanas graficas.

En `src/main/resources/**` hay tres paquetes, `base_de_datos/**` el cual contiene una base de datos de SQLite, esta
base de datos es embebida, `imagenes/**` el cual contiene las imagenes que se usaran el la aplicacion y 
`repostes/**` el cual contiene los archivos .jasper para la generacion de los reportes pdf.

### Contribuciones

Para hacer contribuciones al proyecto y agregar nuevas funcionalidades sigua estos pasos y consideraciones:

1. Hacer un fork del repositorio original a tu cuenta de GitHub.
2. Clonar tu fork desde el repositorio remoto a tu máquina local.
3. Crear una nueva rama en tu fork local desde la rama `develop` para trabajar en tus cambios.
4. Realizar los cambios necesarios en tu nueva rama.
5. Hacer commit y merge de tus cambios desde tu nueva rama a la rama `develop`.
6. Hacer push de tu nuevos cambios de la rama `develop` a la rama `develop` de tu fork en tu repositorio Remoto.
6. Crear un pull request desde tu rama `develop` en tu fork hacia la rama `develop` del repositorio original. 

Debe considerar aplicar un formato a la hora de colocar los mensajes de sus commit, deben de ser descriptivos para
los cambios que se hicieron o agrgaron siguiendo las pautas del ***Coventional Commit***. Ejemplo:

 ```
 feat(paquete.Clases):Agregar nuevo metodo

  - Agregar nuevo metodo que hace tal cosa.
  - Agregar la llamada del metodo en otro metodo.
  - Cambiar el algo el el metodo anterior.
 ```

Los cambios de los commits deben se significativos y con un nuemero de cambios  lo suficiente para hacer adecuada 
su reviciones, es decir, commits atomicos, cortos mejoran la revision.

### Autores

- **Carlos Daniel Hernandez Duran** - *Desarrollador Princial* - profesionalengineer123@gmail.com
  -LinkedIn: https://www.linkedin.com/in/carlosdaniel16
