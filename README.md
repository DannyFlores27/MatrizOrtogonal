Manual de Usuario - Matriz Ortogonal
El programa MatrizOrtogonal es una aplicación Java que permite gestionar una matriz ortogonal de vehículos. Proporciona diversas funcionalidades para ingresar, buscar, eliminar y mostrar vehículos almacenados en la matriz.

Requisitos Previos
Se requiere tener instalado Java Development Kit (JDK) en el sistema.
Se recomienda el uso de un Entorno de Desarrollo Integrado (IDE) como IntelliJ IDEA, Eclipse o NetBeans para compilar y ejecutar el programa de manera más conveniente.
Inicio del Programa
Para ejecutar el programa, sigue estos pasos:

Abre tu IDE preferida (por ejemplo, IntelliJ IDEA, Eclipse o NetBeans).
Importa el proyecto o abre el archivo MatrizOrtogonal.java.
Compila y ejecuta el programa desde tu IDE.
Al utilizar una IDE, tendrás acceso a características como la depuración, gestión de dependencias y un entorno de desarrollo más amigable, lo que facilitará el proceso de desarrollo y ejecución del programa MatrizOrtogonal.
Uso del Programa
Menú #1: Configuración de la Matriz
Al iniciar el programa, se presentará el Menú #1, donde podrás configurar las dimensiones de la matriz de vehículos.

Ingresar cantidad de filas y columnas: Permite al usuario especificar el número de filas y columnas para la matriz.
Generar cantidad aleatoria de filas y columnas: Genera un número aleatorio de filas y columnas para la matriz.
Salir: Finaliza la ejecución del programa.
Menú #2: Operaciones con Vehículos
Una vez configurada la matriz, se presentará el Menú #2 para realizar operaciones con los vehículos almacenados.

Ingresar vehículo: Permite al usuario ingresar los datos de un nuevo vehículo.
Buscar vehículo: Busca un vehículo en la matriz según un criterio especificado.
Eliminar vehículo: Permite eliminar un vehículo de la matriz.
Mostrar todos los vehículos guardados: Muestra todos los vehículos almacenados en la matriz.
Salir: Finaliza la ejecución del programa.
Notas Adicionales
En caso de ingresar datos inválidos, el programa mostrará un mensaje de error y solicitará nuevamente la entrada.
Las posiciones de fila y columna se indexan desde 1 hasta el número máximo especificado.
Para salir en cualquier momento, puedes seleccionar la opción correspondiente en los menús.
¡Disfruta del Programa!
Con el programa MatrizOrtogonal, podrás gestionar de manera eficiente una matriz de vehículos de forma dinámica y realizar diversas operaciones con ellos.

![1 1](https://github.com/DannyFlores27/MatrizOrtogonal/assets/126033449/4425007e-30e9-4e6a-b4a8-30445e3ffe31)
![1 2](https://github.com/DannyFlores27/MatrizOrtogonal/assets/126033449/58d8832f-6bff-477c-8fe9-537c42ae9947)
![1 3](https://github.com/DannyFlores27/MatrizOrtogonal/assets/126033449/8ea8adbd-fb07-45e6-84b7-783bc1591a14)
![1 4](https://github.com/DannyFlores27/MatrizOrtogonal/assets/126033449/eaeaa8a9-da39-4a27-b1a3-5b8b3b37ab7d)
![1 5](https://github.com/DannyFlores27/MatrizOrtogonal/assets/126033449/a50aef9c-db9a-48e3-b9d9-1d3a22543332)

Manual Técnico - Matriz Ortogonal
Descripción
El programa MatrizOrtogonal es una aplicación Java que implementa una matriz ortogonal para gestionar vehículos. Proporciona funcionalidades para ingresar, buscar, eliminar y mostrar vehículos almacenados en la matriz.

Estructura del Proyecto
El proyecto está organizado en los siguientes paquetes y clases:

Paquete programacioniii.matrizortogonal
MatrizOrtogonal.java: Clase principal que contiene el método main para iniciar la aplicación.
Paquete programacioniii.matrizortogonal.logica
MatrizDinamica.java: Clase que representa la matriz ortogonal y proporciona métodos para operar con ella.
Nodo.java: Clase que define un nodo para almacenar un vehículo en la matriz.
Vehiculo.java: Clase que representa un vehículo con sus atributos.
Requisitos del Sistema
Java Development Kit (JDK): Se requiere JDK 8 o superior para compilar y ejecutar el programa.
Entorno de Desarrollo Integrado (IDE): Se recomienda el uso de una IDE como IntelliJ IDEA, Eclipse o NetBeans para facilitar el desarrollo y la ejecución del programa.
Compilación y Ejecución
Para compilar y ejecutar el programa desde una IDE:

Abre tu IDE preferida.
Importa el proyecto o crea uno nuevo.
Ubica el archivo MatrizOrtogonal.java en el paquete programacioniii.matrizortogonal.
Compila el proyecto.
Ejecuta la clase MatrizOrtogonal.
Funcionalidades Principales
El programa MatrizOrtogonal proporciona las siguientes funcionalidades principales:

Ingresar Vehículo: Permite al usuario ingresar los datos de un nuevo vehículo y almacenarlo en la matriz en una posición específica o aleatoria.
Buscar Vehículo: Permite buscar un vehículo en la matriz según un criterio especificado (placa, color, línea, modelo o propietario).
Eliminar Vehículo: Permite eliminar un vehículo de la matriz, ya sea por posición o por placa.
Mostrar Vehículos: Muestra todos los vehículos almacenados en la matriz.
Notas Adicionales
El programa utiliza la clase Scanner para la entrada de datos desde la consola.
Las posiciones de fila y columna en la matriz se indexan desde 1 hasta el número máximo especificado.
Se manejan excepciones para validar la entrada de datos y evitar errores durante la ejecución.
Contribuciones
¡Las contribuciones al proyecto son bienvenidas! Si deseas contribuir, puedes enviar solicitudes de extracción (pull requests) a nuestro repositorio en GitHub.
