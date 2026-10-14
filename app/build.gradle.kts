plugins {
    application
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

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
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