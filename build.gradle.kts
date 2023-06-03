import org.gradle.jvm.tasks.Jar
import proguard.gradle.ProGuardTask
import kotlin.collections.map
import kotlin.collections.set

plugins {
    `java-library`
    `maven-publish`
}

repositories {
    mavenLocal()
    maven("https://jcenter.bintray.com")
    maven("https://jitpack.io")
}

dependencies {
    api("com.google.guava:guava:31.1-jre")
    api("org.apache.commons:commons-text:1.10.0")
    api("javax.inject:javax.inject:1")
    api("org.slf4j:slf4j-api:2.0.5")
    api("com.google.inject:guice:5.1.0")
    api("ch.qos.logback:logback-core:1.3.5")
    api("ch.qos.logback:logback-classic:1.3.5")
    api("club.minnced:java-discord-rpc:2.0.0")
    api("com.google.code.gson:gson:2.10")
    api("net.runelite.pushingpixels:substance:8.0.02")
    api("net.runelite.pushingpixels:trident:1.5.00")
    runtimeOnly("net.runelite.pushingpixels:trident:1.5.00")
    compileOnly("org.projectlombok:lombok:1.18.24")
    compileOnly("javax.servlet:javax.servlet-api:4.0.1")
    annotationProcessor("org.projectlombok:lombok:1.18.24")
}

buildscript {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
    dependencies {
        classpath("com.guardsquare:proguard-gradle:7.1.0")
    }
}

val fatJar = task("fatJar", type = Jar::class) {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    archiveBaseName.set(project.name)
    manifest {
        attributes["Implementation-Title"] = "Gradle Jar File"
        attributes["Main-Class"] = "net.runelite.client.RuneLite"
    }
    from(configurations.compileClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    with(tasks.jar.get() as CopySpec)
}

val proguard = tasks.register<ProGuardTask>("proguard") {
    configuration("proguard-rules.pro")
}

tasks {
    "build" {
        dependsOn(fatJar)
        dependsOn(proguard)
    }
}

group = "net.runelite"
version = "1.0"
description = "Tarn"
java.sourceCompatibility = JavaVersion.VERSION_1_8

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}


//tasks.named("build") {finalizedBy("proguard")}


