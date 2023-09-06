import org.gradle.jvm.tasks.Jar
import proguard.gradle.ProGuardTask
import kotlin.collections.map
import kotlin.collections.set

plugins {
    `java-library`
    `maven-publish`
}

group = "net.runelite"
version = "1.0"
description = "Tarn"
java.sourceCompatibility = JavaVersion.VERSION_1_8


repositories {
    mavenLocal()
    maven("https://jcenter.bintray.com")
    maven("https://jitpack.io")
    maven("https://repo.runelite.net")
}

dependencies {
    implementation ("com.google.guava:guava:31.1-jre")
    implementation ("org.apache.commons:commons-text:1.10.0")
    implementation ("javax.inject:javax.inject:1")
    implementation ("org.slf4j:slf4j-api:2.0.5")
    implementation ("com.google.inject:guice:5.1.0")
    implementation ("ch.qos.logback:logback-core:1.3.5")
    implementation ("ch.qos.logback:logback-classic:1.3.5")
    implementation ("club.minnced:java-discord-rpc:2.0.0")
    implementation ("com.google.code.gson:gson:2.10")
    implementation ("net.runelite.pushingpixels:substance:8.0.02")
    implementation ("net.runelite.pushingpixels:trident:1.5.00")
    implementation ("net.java.dev.jna:jna:5.8.0")
    implementation("com.hankcs:aho-corasick-double-array-trie:1.2.2")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.15.2")
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
        classpath("com.guardsquare:proguard-gradle:7.3.2")
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
    libraryjars(configurations.runtimeClasspath)
}

tasks {
    "build" {
        dependsOn(fatJar)
        dependsOn(proguard)
    }
}
