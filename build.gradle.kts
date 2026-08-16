plugins {
    kotlin("jvm") version "2.0.20"
    application
}

repositories {
    mavenCentral()
}

application {
    mainClass.set("main.kotlin.MainKt")
}