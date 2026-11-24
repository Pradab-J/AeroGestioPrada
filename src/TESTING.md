TESTING – AeroGestión Prada
1. Objetivo

Documentar el proceso de pruebas automatizadas realizado al sistema AeroGestión Prada, con el propósito de verificar el funcionamiento del módulo de inicio de sesión del administrador e identificar posibles errores.

2. Herramientas utilizadas
Java 21.
Apache NetBeans 25.
Maven.
JUnit 5.
MySQL.
JDBC.
3. Módulo evaluado

Módulo: Inicio de sesión del administrador.

Clase evaluada: usuarioDAO.

Clase de pruebas: usuarioDAOTest.

4. Casos de prueba

Se definieron seis casos para verificar diferentes condiciones del inicio de sesión.

Código	Caso de prueba	Resultado esperado
CP-01	Inicio de sesión correcto	Permitir el acceso al administrador activo.
CP-02	Contraseña incorrecta	Rechazar el acceso.
CP-03	Usuario inexistente	Rechazar el acceso.
CP-04	Administrador inactivo	Impedir el acceso.
CP-05	Usuario sin rol de administrador	Impedir el acceso.
CP-06	Campos vacíos	Rechazar el acceso.
4.1 Detalle de los casos de prueba
Código	Datos de entrada	Condición previa en la base de datos	Resultado esperado
CP-01	Usuario y contraseña válidos	Administrador registrado, con estado activo	Acceso permitido
CP-02	Usuario válido y contraseña incorrecta	Administrador registrado	Acceso rechazado
CP-03	Usuario que no existe en la base de datos	Ninguna	Acceso rechazado
CP-04	Usuario y contraseña válidos	Administrador registrado, con estado inactivo	Acceso impedido
CP-05	Usuario y contraseña válidos	Usuario registrado con un rol distinto a administrador	Acceso impedido
CP-06	Usuario y contraseña vacíos	Ninguna	Acceso rechazado
5. Configuración del entorno

Para ejecutar las pruebas con JUnit 5, el archivo pom.xml debe incluir las siguientes dependencias:

xml
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.10.2</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <version>8.3.0</version>
    </dependency>
</dependencies>

Además, el servidor MySQL debe estar en ejecución y la base de datos de AeroGestión Prada debe contener los datos de prueba necesarios para cada caso (administrador activo, administrador inactivo y usuario sin rol de administrador).

6. Procedimiento de ejecución

Las pruebas se realizan utilizando JUnit 5 y Maven.

Para ejecutarlas desde Apache NetBeans:

Abrir el proyecto AeroGestión Prada.
Ubicar la clase usuarioDAOTest en Test Packages.
Hacer clic derecho sobre la clase.
Seleccionar la opción Test File.
Revisar los resultados obtenidos.

También se pueden ejecutar desde la terminal, ubicándose en la carpeta principal del proyecto y utilizando el siguiente comando:

bash
mvn clean test
7. Resultados de las pruebas

Los resultados se registrarán después de ejecutar las pruebas automatizadas.

7.1 Resumen general
Descripción	Resultado
Total de pruebas	6
Pruebas exitosas	Pendiente de ejecución
Pruebas fallidas	Pendiente de ejecución
Errores	Pendiente de ejecución
Pruebas omitidas	Pendiente de ejecución
7.2 Resultado por caso de prueba
Código	Caso de prueba	Resultado esperado	Resultado obtenido	Estado
CP-01	Inicio de sesión correcto	Permitir el acceso al administrador activo	Pendiente	Pendiente
CP-02	Contraseña incorrecta	Rechazar el acceso	Pendiente	Pendiente
CP-03	Usuario inexistente	Rechazar el acceso	Pendiente	Pendiente
CP-04	Administrador inactivo	Impedir el acceso	Pendiente	Pendiente
CP-05	Usuario sin rol de administrador	Impedir el acceso	Pendiente	Pendiente
CP-06	Campos vacíos	Rechazar el acceso	Pendiente	Pendiente
8. Evidencias

Se incluirán capturas de pantalla que permitan comprobar el proceso realizado.

8.1 Código de la clase usuarioDAOTest

📷 Captura: clase usuarioDAOTest abierta en NetBeans, mostrando los seis métodos de prueba.

![Código usuarioDAOTest](imagenes/testing-01-codigo.png)
8.2 Ejecución de las pruebas desde NetBeans

📷 Captura: ventana Test Results de NetBeans después de ejecutar Test File, mostrando el resultado de cada prueba.

![Ejecución en NetBeans](imagenes/testing-02-netbeans.png)
8.3 Resultado de la ejecución desde Maven en la terminal

📷 Captura: terminal con el comando mvn clean test ejecutado, incluyendo el resumen Tests run: 6, Failures: 0, Errors: 0, Skipped: 0 y BUILD SUCCESS.

![Ejecución en Maven](imagenes/testing-03-maven.png)
9. Conclusión

Las pruebas automatizadas permiten verificar el comportamiento del módulo de inicio de sesión ante diferentes situaciones, como credenciales incorrectas, usuarios inexistentes, cuentas inactivas y usuarios sin permisos de administrador.

Los resultados obtenidos permitirán identificar posibles fallos y comprobar las correcciones realizadas en el sistema.
