// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.4.0-alpha07" apply false
    id("com.android.library") version "7.4.0-alpha07" apply false
    id("org.jetbrains.kotlin.android") version "1.6.20" apply false

    id(BuildPlugins.openApiGenerator)
    id(BuildPlugins.spotless)
}

openApiGenerate {
    val apiModuleName = "web"
    val dateLibrary = "threetenbp"
    val collectionType = "list"
    val parcelizeModels = "true"

    generatorName.set("kotlin")
    inputSpec.set("http://192.168.137.1:5001/swagger/v1/swagger.json")
    outputDir.set("$rootDir/$apiModuleName")
    templateDir.set("$rootDir/templates/kotlin-client")
    apiPackage.set("com.example.$apiModuleName.api")
    invokerPackage.set("com.example.$apiModuleName")
    modelPackage.set("com.example.$apiModuleName.model")
    generateModelDocumentation.set(false)
    configOptions.set(
        mapOf(
            "dateLibrary" to dateLibrary,
            "collectionType" to collectionType,
            "parcelizeModels" to parcelizeModels
        )
    )
}

