# PRUEBA CRUD

## 1. Introducción
#### Pequeña aplicación CRUD para crear, eliminar, obtener todos o por id diferentes usuarios. Usando una base de datos en memoria

### Autores
- Brian Ojeda - Desarrollador principal

## 2. Requisitos Previos
### Software Necesario
- Java JDK 8 o superior

## 3. Estructura del Proyecto
- src/ - código fuente
- test/ - Test para los métodos del paquete User 

## 4. Uso
### Instrucciones de ejecución
1. Ejecute la clase Main.java
2. Siga las instrucciones en pantalla

## 7. Funcionalidades Principales
### Clase User.java
#### La clase User tiene como objetivo representar un usuario con propiedades esenciales. Se definen las siguientes propiedades:

- id: Identificación única del usuario.
- firstName: Primer nombre del usuario.
- lastName: Apellido del usuario.
- email: Dirección de correo electrónico del usuario.
- phone: Número de teléfono del usuario.
- roles: Lista de roles asociados al usuario.
Consideraciones al diseñar la clase User:

##### Validación de Propiedades Obligatorias:

- firstName, lastName, email y phone son propiedades obligatorias. Se implementa una validación para asegurar que no se asignen cadenas vacías o valores null a estas propiedades.
#### Métodos Modificadores de Acceso:

- Se han creado métodos modificadores de acceso para cada propiedad, permitiendo la manipulación segura de los datos del usuario.
Roles de Usuario:

- La propiedad roles es un array que representa los roles asociados al usuario. Al instanciar un objeto de la clase User, inicialmente no tiene asignado ningún rol.
Roles de Usuario:

- La propiedad roles es un array que representa los roles asociados al usuario. Al instanciar un objeto de la clase User, inicialmente no tiene asignado ningún rol.
Clase UserService.java

- La clase UserService se encarga de realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre la entidad User. Contiene las siguientes propiedades y métodos:

## Base de Datos en Memoria:

#### Utiliza un Hashtable para almacenar una lista de objetos User, simulando una base de datos en memoria.
##### getUserById Método:

- Recibe un id y devuelve el objeto User correspondiente desde la base de datos en memoria.

##### save Método:

- Inserta un nuevo objeto User en la base de datos en memoria.
delete Método:

#### delete Método:
- Elimina un objeto User de la base de datos en memoria según el id proporcionado.
getAll Método:

#### getAll Método
- Retorna todos los objetos User existentes en la base de datos en memoria.

# Controllers Descripción

## AssignedRole Controller
### La clase AssignedRole se encarga de asignar roles a usuarios. A continuación, se describen las funcionalidades principales:

#### Entrada de Datos:

- Solicita al usuario ingresar un identificador de rol (idRole), el nombre del rol (name), y el identificador del usuario (idUser).
Validaciones:

- Verifica que el identificador de rol sea un número entero positivo.
- Solicita el nombre del rol y lo asigna a un objeto Role.
- Solicita el identificador del usuario y obtiene el objeto User correspondiente desde la base de datos.
- Asignación de Rol:

#### Añade el rol creado al usuario y muestra la información actualizada del usuario.
- Iteración y Salida:

- Pregunta al usuario si desea realizar la asignación de roles para otro usuario (YES/NO).

## Create Controller
### La clase Create facilita la creación de nuevos usuarios en la base de datos. A continuación, se describen las funcionalidades principales:

#### Entrada de Datos:

- Solicita al usuario ingresar un identificador de usuario (id), el primer nombre (firstName), el apellido (lastName), el correo electrónico (email), y el número de teléfono (phone).
Validaciones:

- Verifica que el identificador de usuario sea un número entero positivo.
- Solicita y valida las propiedades obligatorias (firstName, lastName, email, phone).
- Creación de Usuario:

#### Crea un nuevo objeto User con los datos proporcionados.
- Muestra la información del usuario creado.
- Iteración y Salida: Pregunta al usuario si desea crear otro usuario (YES/NO).

## Delete Controller
### La clase Delete permite eliminar usuarios de la base de datos. A continuación, se describen las funcionalidades principales:

#### Entrada de Datos:

- Solicita al usuario ingresar el identificador del usuario (id) que se desea eliminar.
Validaciones:

- Verifica que el identificador de usuario sea un número entero positivo.
Eliminación de Usuario:

- Elimina el usuario de la base de datos y muestra información sobre la operación.
- Iteración y Salida: Pregunta al usuario si desea eliminar otro usuario (YES/NO).

## GetAll Controller
### La clase GetAll muestra todos los usuarios existentes en la base de datos. A continuación, se describen las funcionalidades principales:


#### Obtención y Muestra de Usuarios:

- Obtiene todos los usuarios de la base de datos y muestra su información.
- Manejo de Errores: En caso de algún error, muestra un mensaje indicando la naturaleza del problema.



## GetById Controller
### GetById Controller La clase GetById permite obtener información detallada sobre un usuario mediante su identificador. A continuación, se describen las funcionalidades principales:

#### Entrada de Datos:

- Solicita al usuario ingresar el identificador del usuario (id) del cual desea obtener información detallada.
Validaciones:

- Verifica que el identificador de usuario sea un número entero positivo.
- Obtención y Muestra de Usuario: Obtiene el usuario correspondiente al identificador ingresado y muestra su información.
- Iteración y Salida: Pregunta al usuario si desea obtener información de otro usuario (YES/NO). de Usuarios:
