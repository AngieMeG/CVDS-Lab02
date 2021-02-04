# Laboratorio 02 CVDS
## PATTERNS - FACTORY
### LA HERRAMIENTA MAVEN
**Cuál es su mayor utilidad**
Maven esta pensado para la gestion y despliegue rapido, simple y ordenado de proyectos (siguendo buenas practicas) basados en Java.
**Fases de maven**
Las partes del ciclo de vida principal de un proyecto Maven son:
* ***complie:*** Se generan los ficheros .class compilando las fuentes .java
* ***test:*** Ejecuta los test automaticos de JUnit existentes, abordando el proceso si alguno de ellos falla
* ***package:*** Genera el fichero .jar con los .class compilados
* ***install:*** Copia el fichero .jar a un directorio de nuestro ordenador donde maven deja todos los .jar. De esta forma esos .jar pueden utilizarse en otros proyectos maven en el mismo ordenador.
* ***deploy:*** Copia el fichero .jar a un servidor remoto, poniéndolo disponible para cualquier proyecto maven con acceso a ese servidor remoto.

**Ciclo de vida de la construcción**
Se tienen tres ciclos de vida:
* ***El ciclo de vida default***, que gestiona la construcción y despliegue del proyecto.
* ***El ciclo de vida clean***, que gestiona la limpieza del directorio del proyecto. Es decir, se encarga de eliminar todos los archivos generados en el proceso de construcción y despliegue.
* ***El ciclo de vida site***, que gestiona la creación de la documentación del proyecto.
**Para qué sirven los plugins**
Los plugins tienen como finalidad principal aportar funciones adicionales a aplicaciones web o programas informaticas. Estos solo amplian porgramas ya existentes, por lo que no pueden funcionar por si solos.

**Qué es y para qué sirve el repositorio central de maven**
Es un repositorio provisto por la comunidad de Maven. Este contiene un largo número de librerias comunmente usadas.
Cuando Maven no encuntra una dependencia en el repositorio local, empieza a buscar en el repositorio central.
## EJERCICIO DE LAS FIGURAS
### CREAR UN PROYECTO CON MAVEN
**Buscar cómo se crea un proyecto maven con ayuda de los arquetipos (archetypes).**

**Busque cómo ejecutar desde línea de comandos el objetivo "generate" del plugin "archetype", con los siguientes parámetros:**
* Grupo: edu.eci.cvds
* Id del Artefacto: Patterns
* Paquete: edu.eci.cvds.patterns
* archetypeArtifactId: maven-archetype-quickstart 

*mvn archetype:generate -DgroupId=edu.eci.cvds -DartifactId=Patterns -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false* ![image](1.png)
### COMPILAR Y EJECUTAR
**Busque cuál es el objetivo del parámetro "package" y qué otros parámetros se podrían enviar al comando mvn.** 
Compila la aplicación de java en torno a las dependencias declaradas en el POM ![image](2.png)

**Busque cómo ejecutar desde línea de comandos, un proyecto maven y verifique la salida cuando se ejecuta con la clase App.java como parámetro en "mainClass".** ![image](3.png)

**Realice el cambio en la clase App.java para crear un saludo personalizado, basado en los parámetros de entrada a la aplicación. Utilizar la primera posición del parámetro que llega al método "main" para realizar el saludo personalizado, en caso que no sea posible, se debe mantener el saludo como se encuentra actualmente:**

* Buscar cómo enviar parámetros al plugin "exec".
* Ejecutar nuevamente la clase desde línea de comandos y verificar la salida: Hello World! ![image](6.png)
* Ejecutar la clase desde línea de comandos enviando su nombre como parámetro y verificar la salida. Ej: Hello Pepito! ![image](4.png)
* Ejecutar la clase con su nombre y apellido como parámetro. ¿Qué sucedió? 
* Verifique cómo enviar los parámetros de forma "compuesta" para que el saludo se realice con nombre y apellido.
* Ejecutar nuevamente y verificar la salida en consola. Ej: Hello Pepito Perez! ![image](5.png)
### HACER EL ESQUELETO DE LA APLICACIÓN