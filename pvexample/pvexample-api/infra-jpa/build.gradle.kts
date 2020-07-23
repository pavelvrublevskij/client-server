dependencies {
  implementation("org.springframework.boot:spring-boot-starter-data-jpa")
  implementation("javax.validation:validation-api:2.0.1.Final")
  implementation("com.h2database:h2")
}

tasks.bootJar {
  enabled = false
}
