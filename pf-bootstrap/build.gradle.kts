tasks.getByName("bootJar") {
    enabled = true
}

tasks.getByName("jar") {
    enabled = false
}

dependencies {
    implementation(project(":pf-api"))
    implementation(project(":pf-application"))
    implementation(project(":pf-domain"))
    implementation(project(":pf-infrastructure:db-core"))
    implementation(project(":pf-support:logging"))
    implementation(project(":pf-support:monitoring"))
}
