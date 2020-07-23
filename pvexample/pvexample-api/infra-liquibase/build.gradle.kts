dependencies {
    runtimeOnly("org.liquibase:liquibase-core:3.8.9")
}

tasks.bootJar {
    enabled = false
}
