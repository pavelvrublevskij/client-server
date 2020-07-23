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

    dependencies {
        compileOnly("org.springframework.boot:spring-boot-configuration-processor")
        compileOnly("org.projectlombok:lombok:1.18.12")
        annotationProcessor("org.projectlombok:lombok:1.18.12")

        testImplementation("org.assertj:assertj-core")
        testImplementation("org.mockito:mockito-core:2.24.0")
        testImplementation("org.mockito:mockito-junit-jupiter:2.24.0")
        testImplementation("org.junit.platform:junit-platform-runner:1.3.2")
        testImplementation("org.junit.jupiter:junit-jupiter-params:5.3.2")
        testImplementation("org.junit.jupiter:junit-jupiter-api:5.3.2")
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.3.2")
    }

    tasks.jar {
        enabled = true
    }

    tasks.test {
        useJUnitPlatform()
    }
}

dependencies {
    // put here sub project as dependencies
    implementation(project(":pvexample-main"))
    implementation(project(":infra-web"))
    implementation(project(":infra-jpa"))
    implementation(project(":infra-liquibase"))
}

tasks.wrapper {
    version = "6.3"
}

springBoot {
    mainClassName = "lt.asprogramuoju.pvexample.PVExampleApplication"
}
