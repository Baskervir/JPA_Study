plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("jakarta.persistence:jakarta.persistence-api:2.2.3")
    implementation("org.hibernate:hibernate-core:5.6.15.Final")
    implementation("com.h2database:h2:2.2.224")
    implementation("org.slf4j:slf4j-simple:2.0.9")
}

tasks.test {
    useJUnitPlatform()
}