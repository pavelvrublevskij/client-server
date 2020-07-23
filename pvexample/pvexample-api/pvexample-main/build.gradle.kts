dependencies {
  implementation(project(":infra-web"))
  implementation(project(":infra-liquibase"))

  implementation("org.springframework.boot:spring-boot-starter-web")
  implementation("org.springframework.boot:spring-boot-starter-data-jpa")
  implementation("com.h2database:h2")
}
