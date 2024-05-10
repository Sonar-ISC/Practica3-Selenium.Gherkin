plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.seleniumhq.selenium:selenium-java:4.19.1")

    testImplementation (platform("org.junit:junit-bom:5.9.1"))
    testImplementation ("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine")
    testImplementation ("io.cucumber:cucumber-java:7.17.0")
    testImplementation ("io.cucumber:cucumber-junit:7.17.0")
}

tasks.test {
    useJUnitPlatform()
}
