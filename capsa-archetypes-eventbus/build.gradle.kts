dependencies {
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("digital.capsa:capsa-core")
    implementation("javax.validation:validation-api")
    implementation("org.apache.commons:commons-text")
    implementation("org.jetbrains.kotlin:kotlin-noarg")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.postgresql:postgresql")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.cloud:spring-cloud-starter-stream-kafka")
    implementation(project(":capsa-archetypes-core"))
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
