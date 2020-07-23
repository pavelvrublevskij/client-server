dependencies {
  implementation(project(":infra-jpa"))

  implementation("org.springframework.boot:spring-boot-starter-web")
  implementation("org.springframework.boot:spring-boot-starter-actuator")
  implementation("org.springframework.boot:spring-boot-starter-data-jpa")

  testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.bootJar {
  enabled = false
}
