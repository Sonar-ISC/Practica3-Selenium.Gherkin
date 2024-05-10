# Practica 3 Selenium WebDriver Gherkin

Este repositorio es para practicar el uso de Selenium WebDriver con Java. También, que funcione como plantilla para proyectos futuros.


## Consideraciones

- Para hacer el pull request, pueden iniciar sesión en GitHub con IntelliJ para mayor facilidad.
- Crean una rama con su nombre
- Deben descargar el driver correspondiente a su navegador y sistema operativo.

## Tecnologías

- Selenium WebDriver
- JUnit
- Gradle
- Gherkin
- Cucumber
- Page Object Model

## Material de apoyo

- [Manual Pull Request](https://drive.google.com/file/d/1OagidqedQAEj3h_LoacEr7wqJLBv7XER/view?usp=sharing)
- [Selenium WebDriver Documentación oficial](https://www.selenium.dev/documentation/en/webdriver/)
- [Selenium WebDriver PDF](https://drive.google.com/file/d/1vXx2OJF-xUjc7_YLAGHXSmEZkAUyExR_/view?usp=sharing)
- [JUnit](https://junit.org/junit5/docs/current/user-guide/)
- [Gradle](https://docs.gradle.org/current/userguide/userguide.html)
- [Page Object Model](https://www.selenium.dev/documentation/en/guidelines_and_recommendations/page_object_models/)
- [Gherkin](https://cucumber.io/docs/gherkin/reference/)
- [Cucumber](https://cucumber.io/docs/guides/10-minute-tutorial/)

## Ejercicios 

### Ejercicio 1 - Login

Utilizando Gherkin, escribe escenarios en un archivo .feature para el proceso de login en [SauceDemo](https://www.saucedemo.com/)
.Estos deben incluir escenarios para un login exitoso y para manejar errores comunes como credenciales incorrectas.

### Ejercicio 2 - Añadir al carrito

Utilizando Gherkin, escribe escenarios en un archivo .feature para el proceso de añadir un producto al carrito en [SauceDemo](https://www.saucedemo.com/)

## Requisitos

Para poder ejecutar los ejercicios propuestos, es necesario tener instalado lo siguiente:

- Java 8 o superior
- Gradle
- Un navegador con su respectivo driver
- IDE de desarrollo (IntelliJ IDEA, Eclipse, NetBeans)

## Cosas basicas de Selenium

### Get

Get es un método que se utiliza para navegar a una página web. Get es un método que permite la navegación a una página

```
driver.get("https://www.google.com");
```

### By

By es una clase que se utiliza para localizar elementos en una página web. By es una clase que permite la localización
de elementos en una página web.

```java
By button = By.id("id");
```

### WebElement

WebElement es una interfaz que representa un elemento en una página web. WebElement es una interfaz que permite la
interacción con elementos en una página web.

```
WebElement element = driver.findElement(By.id("id"));
```

Se puede interactuar con los elementos de la siguiente manera:

```
element.click();
element.sendKeys("Texto");
element.getText();
element.clear();
```

## Autor

- [Sebastian Agudelo - Co-Lider Sonar I.S.C](https://www.linkedin.com/in/sebastian-agudelo-morales-367970241/)

