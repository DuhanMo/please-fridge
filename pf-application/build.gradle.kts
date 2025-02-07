tasks.getByName("bootJar") {
    enabled = false
}

tasks.getByName("jar") {
    enabled = true
}

dependencies {
    implementation(project(":pf-domain"))
    implementation("org.springframework:spring-tx")
    api("org.springframework.boot:spring-boot-starter-web")
}
