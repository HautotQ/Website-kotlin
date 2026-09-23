import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.kotlinSerialization)
}

kotlin {
    js {
        browser()
        binaries.executable()
    }

    tasks.register<Zip>("exportWebsiteZip") {
        dependsOn("jsBrowserProductionWebpack")

        from(layout.buildDirectory.dir("processedResources/js/main"))

        from(layout.buildDirectory.file("kotlin-webpack/js/productionExecutable/webApp.js"))

        archiveFileName.set("website.zip")
        destinationDirectory.set(layout.buildDirectory.dir("distributions"))
    }

    sourceSets {
        webMain.dependencies {
            implementation(libs.wrappers.browser)
            // Core coroutines library
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.11.0")

            // For Android projects
            implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.9.0")
        }
    }
}