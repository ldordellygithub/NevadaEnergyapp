
![Logo](https://drive.google.com/file/d/1VmHxZWADkqr42A9cSw6IywA9SOf-hJbY/view?usp=sharing)


# Nevada Home Energy Guard APP

 El propósito de este proyecto es desarrollar
 un sistema integral de gestión que permita a los clientes de Nevada Home Energy un mayor
 control y supervisión de su consumo de energía eléctrica, así como facilitar la adquisición de
 productos y servicios de la compañía. 
 
 El sistema se diseñará para abordar tanto las
 necesidades de los consumidores como las de los operadores, con un enfoque en la gestión
 eficiente de datos relacionados con la comercialización de productos y servicios de  nevada  home  energy.!
## 🚀 About Us

¡Saludos a todos en GitHub!

Es un placer presentarnos como un equipo de profesionales apasionados y comprometidos, unidos por la visión de innovar en el desarrollo de aplicaciones y sistemas. 

Nuestro primer proyecto colaborativo es el testimonio de nuestra dedicación y el esfuerzo conjunto para crear soluciones tecnológicas de vanguardia.

Nuestra misión es firme: adoptar las tecnologías emergentes y las estrategias de innovación más avanzadas para ofrecer productos que no solo satisfagan las necesidades actuales sino que también inspiren el futuro de la industria y enriquezcan la vida cotidiana. Con un espíritu de colaboración y una cultura inclusiva, nos desafiamos a nosotros mismos para explorar nuevos horizontes y transformar visiones audaces en éxitos concretos.

## Documento  de Diseño ( DESIG Document)

[Documentation](https://linktodocumentation)

## Arquitectura  del  sistema 

![diagrama_altonivelhomeapp](https://github.com/ldordellygithub/NevadaEnergyapp/assets/112001988/1ca6af35-46a2-4c01-bead-fe2509f7bad5)


## Instalacion  en  tu Repositorio  local


Guía para configurar Git y GitHub en el  proyecto de NevadaHome


1.	Windows: Descarga el instalador de Git desde la página oficial de Git y ejecútalo. Sigue las instrucciones del asistente de instalación.

2.	Mac: Puedes instalar Git usando Homebrew con el comando
```bash 
 brew install git
 ```

 Si no tienes Homebrew, puedes descargar el instalador de Git desde la página oficial de Git y seguir las instrucciones del asistente de instalación.

3.	Linux: Abre una terminal y ejecuta:
```bash 
 sudo apt-get install git 
```
😎


Configuración de GitHub


1.	Crea una cuenta en GitHub si aún no la tienes.

2.	En tu máquina local, abre una terminal y configura tu nombre de usuario de GitHub con el siguiente comando (reemplaza tu-nombre-de-usuario con tu nombre de usuario de GitHub):

```bash 
git config --global user.name "tu-nombre-de-usuario" 
```

3.	Configura tu correo electrónico de GitHub con el siguiente comando (reemplaza tu-correo-electronico con tu correo electrónico de GitHub):

```bash 
git config --global user.email "tu-correo-electronico"
```

Clonar el Repositorio

1.	Abre una terminal en tu máquina local.

2.	Navega al directorio donde deseas clonar el repositorio con el comando cd. Por ejemplo, si deseas clonar el repositorio en tu directorio de Documentos, puedes usar:

```bash 
cd ~/Documentos
```

3.	Ahora puedes clonar el repositorio utilizando el comando git clone. Asegúrate de reemplazar url-del-repositorio con la URL de tu repositorio. Por ejemplo:

```bash 
git clone https://github.com/ldordellygithub/NevadaEnergyapp.git
```

4.	Esto creará un nuevo directorio con el nombre de tu repositorio. 
Puedes navegar a este directorio con:
cd nombre-del-repositorio


Traer todas las ramas del repositorio remot

1.	Para traer todas las ramas del repositorio remoto, puedes usar el comando git fetch:

```bash 
git fetch origin
``` 

2.	Ahora, si ejecutas
 ```bash   
 git branch -a
 ```

deberías ver todas las ramas del repositorio, tanto las locales como las remotas.


Cambiar a una rama específica

1.	Para cambiar a una rama específica, puedes usar el comando git checkout. Por ejemplo, para cambiar a la rama develop, puedes usar:

 ```bash  
git checkout develop
 ```

2.	Si la rama no existe en tu repositorio local, Git la creará automáticamente.

Mantener tu repositorio local actualizado


1.	Es una buena práctica mantener tu repositorio local actualizado con el repositorio remoto. Puedes hacer esto con el comando git pull:

 ```bash 
git pull origin nombre-de-la-rama
 ```

Recuerda reemplazar nombre-de-la-rama con el nombre de la rama que deseas actualizar.


## ESTRUCTURA DEL  PROYECTO


Estructura del Proyecto

1.	Familiarizarse con la Estructura:

    	.mvn: Contiene scripts del wrapper de Maven.
    	src: Contiene el código fuente.
    	main: Código principal de la aplicación.
    	java: Paquetes y clases Java.
    	resources: Recursos como archivos configuración.
    	test: Pruebas de la aplicación.

2.	Modelos :  Navega hasta 

        src/main/java/com/moduloGestionUsuarios/models.

Crea clases Java para tus modelos 
    
        (por ejemplo, User.java).



Desarrollo de los   Modelos:

1.	Crear Clases de Modelos:

    Define las clases en el paquete models:
    
        Ejemplo: public class User { ... }.

2.	Atributos y Métodos:

Define atributos representativos: 

    private String username;

Implementa métodos getters y setters.

        public  void  setUsers(){
            // ejemplo  metho  setters
        };

        public  int getUsers(){
            //  ejemplo  metho  getters
        };


3.	Lógica de Negocio:

Añade métodos para la lógica de negocio dentro de cada clase de modelo  que haz  elaborado.!!


😎🏋️‍♂️


## Run Locally 

Clona  el  proyecto

```bash
  git clone  https://github.com/ldordellygithub/NevadaEnergyapp.git
```
* Importante si  ya  lo  clonaste  no  clones  nuevamente 🙉.! 

Verifica  el  directorio de  tu  proyecto desde  la  termianal

```bash
  cd my-project
```

1.	Configuración del Entorno de Desarrollo:

        * Instala Java JDK (versión recomendada 17).
        * Descarga e instala IntelliJ IDEA o NeatBeans.
        * Configura las variables de entorno JAVA_HOME y PATH.

2.	Importar el Proyecto:

        * Abre IntelliJ IDEA o NeatBeans.
        * Selecciona “Open” o “Import Project”.
        * Navega al directorio del proyecto y selecciona el archivo pom.xml o el directorio raíz
        (omitir este paso)

3.	Revisar la Estructura del Proyecto:

        * Familiarízate con la estructura de directorios Maven (src/main/java, src/main/resources, src/test).

        * Revisa los paquetes de controladores, modelos, servicios y repositorios.

4.	Configuraciones Iniciales (Omitir  este  paso):


        * Examina el archivo application.properties o application.yml para las configuraciones de Spring Boot.
         * Asegúrate de que las dependencias en pom.xml estén correctamente definidas.

5.	Ejecutar el Proyecto:

        * Utiliza la función “Run” de tu IDE para iniciar la aplicación.

        * Verifica que la aplicación se inicie sin errores y que los endpoints estén accesibles.

6.	Desarrollo y Pruebas:

	    * Comienza a agregar o modificar controladores, servicios y modelos según los requisitos.
	
        * Escribe pruebas unitarias y de integración en src/test.



   ## FLUJO  DE  TRABAJO  GIT FLOW


“Flujo de Trabajo Eficaz en Git para Energy Guard  App”

Paso 1: Configuración del entorno de desarrollo

        * Asegúrate de que  tengas instalado el Java Development Kit (JDK), versión 17 o superior.
        * Se deben tener un IDE instalado, ya sea IntelliJ IDEA o NetBeans.
        * Verifica que las variables de entorno JAVA_HOME y PATH estén configuradas correctamente en todas las máquinas.


Paso 2: Clonar el repositorio

•	Cada miembro del equipo debe clonar el repositorio remoto en su máquina local utilizando el comando

 ```bash
        git clone https://github.com/ldordellygithub/NevadaEnergyapp.git 
```
Paso 3: Cambiar a la rama ‘feature’

Después de clonar el repositorio, debes cambiar a la rama ‘feature’ utilizando el comando:


```bash
        git  checkout feature
```

Paso 4: Desarrollar las funcionalidades

    * Ahora, puedes empezar a desarrollar las funcionalidades necesarias en la rama ‘feature’  según las  indicaciones  de  tu  proyect manager .
    *  Recuerden hacer commits frecuentes con mensajes descriptivos utilizando
    * RECUERDA de  lo que  hiciste  en cada  funcionalidad realizada  por  tu código..!


```bash
    git commit -m "mensaje descriptivo"  
```  


Paso 5: Sincronizar con el repositorio remoto

Después de hacer algunos cambios, deben sincronizar su rama ‘feature’ local con la rama ‘feature’ en el repositorio remoto utilizando: 


```bash
    git push origin feature
```  


Paso 6: Solicita una revisión de código

    * Una vez que hayan terminado de desarrollar las funcionalidades en la rama ‘feature’, deben solicitar una revisión de código. 

    * Esto se puede hacer creando una pull request en la interfaz web de GIthub  o de  su sistema de control de versiones.

Paso 7: Fusionar ‘feature’ en ‘develop’

Después de que la revisión de código haya sido aprobada, puedes fusionar la rama ‘feature’ en la rama ‘develop’. Para hacer esto, primero debes cambiar a la rama ‘develop’ con:

```bash
 git checkout develop
``` 

 Luego debes traer los últimos cambios de la rama ‘develop’ del repositorio remoto con:

```bash
  git pull origin develop 
``` 
  Finalmente puedes fusionar la rama ‘feature’ en ‘develop’ con  el  comando 
  
```bash
  git merge feature
``` 

Paso 8: Resolver conflictos de fusión

Si hay conflictos de fusión, deben resolverlos manualmente. 

Una vez resueltos, deben hacer un commit con:

```bash
 git commit -m "resuelto conflictos de fusión" 
 ``` 

 y luego un push a la rama ‘develop’ en el repositorio remoto con el comando:
 
 ```bash
 git push origin develop
 ``` 

Paso 9: Tomate  un café en honor   “Java”; 


😎🏋️‍♂️ 💻 😎





    
## Feedback

If you have any feedback, please reach out to us at dordellyluis@gmail.com



