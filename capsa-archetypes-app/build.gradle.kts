import org.springframework.boot.gradle.tasks.bundling.BootJar

apply(plugin = "kotlin-spring")
apply(plugin = "org.springframework.boot")

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation(project(":capsa-archetypes-command"))
    implementation(project(":capsa-archetypes-query"))
}

tasks.named<BootJar>("bootJar") {
    archiveVersion.set("latest")
}




