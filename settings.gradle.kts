plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "arborweight"

include("arborweight-core", "paperweight-lib", "arborweight-userdev")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
