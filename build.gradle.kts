plugins {
    application
    id("java")
    id("com.github.ben-manes.versions") version "0.64.0"
    id("com.diffplug.spotless") version "8.10.0"
    alias(libs.plugins.versions)
    alias(libs.plugins.version.catalog.update)
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

application {
    mainClass ="hexlet.code.App"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:6.0.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

spotless {
    java {
        target("src/**/*.java")

        googleJavaFormat("1.30.0")
        removeUnusedImports()
        importOrder("java", "javax", "com.yourcompany", "")
        formatAnnotations()
        leadingTabsToSpaces(4)
        endWithNewline()
    }
}