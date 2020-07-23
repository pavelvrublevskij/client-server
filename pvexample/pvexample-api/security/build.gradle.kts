dependencies {
  implementation(project(":security:security-basic"))
}

tasks.jar {
  archiveFileName.set("security.jar")
}
