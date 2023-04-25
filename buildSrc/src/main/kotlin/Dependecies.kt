const val kotlinVersion = "1.6.20"

object BuildPlugins {
    object Versions {

    }

    const val androidApplication = "com.android.application"
    const val jetbrainsAndroid = "org.jetbrains.kotlin.android"
}

object AndroidSdk {
    const val compileSdkVersion = 31
    const val minSdkVersion = 27
    const val targetSdkVersion = 30
}

object Libraries {
    object Versions {
        const val coreKtxVersion = "1.6.0-rc01"
        const val appcompatVersion = "1.4.0-alpha01"
        const val materialVersion = "1.4.0-rc01"
        const val constraintLayoutVersion = "2.1.0-beta02"
        const val lifecycleVersion = "2.3.1"
        const val navigationVersion = "2.3.5"
        const val junitVersion = "4.13"
        const val testJunitVersion = "1.1.2-alpha03"
        const val espressoVersion = "3.3.0-rc01"
    }
    const val core = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appcompatVersion}"
    const val materialDesign = "com.google.android.material:material:${Versions.materialVersion}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
    const val lifecycleLivedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleVersion}"
    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleVersion}"
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigationVersion}"
    const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Versions.navigationVersion}"
    const val junit = "junit:junit:${Versions.junitVersion}"
    const val testJunit = "androidx.test.ext:junit:${Versions.testJunitVersion}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoVersion}"

}