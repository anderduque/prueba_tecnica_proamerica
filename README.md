# Prueba Tecnica ProAmerica

Este repositorio contiene instrucciones para configurar el entorno de desarrollo necesario para ejecutar pruebas de automatización utilizando Java, Maven y generar informes con Allure Report.

## Configuración

### Instalación de Java

Asegúrate de tener Java 8 o una versión posterior instalada en tu sistema. Puedes verificar la instalación ejecutando:

```bash
java -version
```

Si Java no está instalado, puedes descargar e instalar [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) o utilizar una distribución OpenJDK.

### Instalación de Maven

Maven es una herramienta de gestión de proyectos que se utiliza para compilar y gestionar dependencias. Si no tienes Maven instalado, puedes seguir estos pasos:

1. Descarga la última versión de Maven desde [Maven Apache](https://maven.apache.org/download.cgi).

2. Sigue las instrucciones de instalación para tu sistema operativo.

3. Verifica la instalación ejecutando:

```bash
mvn -version
```

### Configuración de Allure

Allure es una herramienta que permite generar informes de pruebas detallados y visualmente atractivos. Puedes configurarlo de la siguiente manera:

1. Instala Allure siguiendo las instrucciones en [Allure Installation](https://docs.qameta.io/allure/#_installing_a_commandline).

2. Verifica la instalación de Allure ejecutando:

```bash
allure --version
```

## Ejecución de Pruebas

1. Ejecuta las pruebas utilizando Maven y la suite de TestNG:

```bash
mvn clean test
```

2. Después de la ejecución de las pruebas, puedes generar un informe de Allure con el siguiente comando:

```bash
mvn allure:report
```

El informe se generará en el directorio: [target/allure-report/allure-maven.html](target/allure-report/allure-maven.html)

### Author Anderson Duque 20 Octubre 2023