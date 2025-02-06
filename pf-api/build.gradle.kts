tasks.getByName("bootJar") {
    enabled = true
}

tasks.getByName("jar") {
    enabled = false
}

dependencies {
    implementation(project(":pf-application"))
    implementation(project(":pf-domain"))
    implementation(project(":pf-infrastructure:mysql"))

    api("org.springframework.boot:spring-boot-starter-web")
}
