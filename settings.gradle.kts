
pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
    }
    plugins {
        kotlin("multiplatform").version("1.5.21")
        kotlin("android").version("1.5.21")
    }
}

rootProject.name = "AndroidLearningApp"
include(":app")
    