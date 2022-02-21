# Framework of automated GUI tests with Selenium WebDriver, JUnit5, Java and Gradle

Framework to test in the graphical user interface layer.

# Pre-conditions

Tools:
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
- [Java SE Development Kit 11](https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html)

Libraries:
- [JUnit5](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine/5.8.0-M1) to support the test creation
- [Selenium WebDriver](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java) library to test the GUI
- [WebDriverManager](https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager) library to manage the drivers needed to open the browser

# Patterns Applied
- Page Objects
- Base Test

# CLI
Run all test classes through command line:

Linux/Mac

    ./gradlew clean test  

Windows

    gradle clean test

# Report
As soon as tests are executed, a html file report is displayed:

`build -> reports -> tests -> test -> index.html`
