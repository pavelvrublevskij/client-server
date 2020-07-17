plugins {
    java
    id("org.springframework.boot") version "2.2.6.RELEASE"
    id("io.spring.dependency-management") version "1.0.9.RELEASE"
}

allprojects {
    apply(plugin = "java-library")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")

    configure<JavaPluginConvention> {
        //TODO: sourceCompatibility = JavaVersion.VERSION_11
        sourceCompatibility = JavaVersion.VERSION_1_8
    }

    repositories {
        mavenCentral()
    }
}

dependencies {
    // put here sub project as dependencies
    implementation(project(":pvexample-main"))
}

tasks.wrapper {
    version = "6.3"
}

springBoot {
    mainClassName = "lt.asprogramuoju.pvexample.PVExampleApplication"
}
