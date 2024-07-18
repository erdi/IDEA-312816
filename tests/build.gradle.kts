plugins {
    java
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(project(":extension-provider-configuration-file"))
    testImplementation(platform("org.junit:junit-bom:5.10.3"))
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation(platform("org.assertj:assertj-bom:3.26.3"))
    testImplementation("org.assertj:assertj-core")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.test {
    useJUnitPlatform()
    systemProperty("junit.jupiter.extensions.autodetection.enabled", "true")
}