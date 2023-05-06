const val kotlinVersion = "1.6.20"

object BuildPlugins {
    object Versions {


    }

    const val androidApplication = "com.android.application"
    const val jetbrainsAndroid = "org.jetbrains.kotlin.android"

    const val openApiGenerator = "org.openapi.generator"
    const val spotless = "com.diffplug.gradle.spotless"

    const val androidLibrary = "com.android.library"
    const val crashlyticsGradle = "com.google.firebase.crashlytics"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"
    const val kotlinKapt = "kotlin-kapt"
    const val androidNavigationSafeArgs = "androidx.navigation.safeargs.kotlin"
    const val googleServices = "com.google.gms.google-services"
    const val firebasePerformance = "com.google.firebase.firebase-perf"
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
        // Web dependencies
        const val kotlinMoshiVersion = "1.13.0"
        const val kotlinTestVersion = "2.0.7"
        const val okHttp3Version = "5.0.0-alpha.2"
        const val okioVersion = "3.0.0-alpha.1"
        const val threeTenBpVersion = "1.3.0"
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
    //web
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp3Version}"
    const val okHttpBrotliInterceptor = "com.squareup.okhttp3:okhttp-brotli:${Versions.okHttp3Version}"
    const val okHttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp3Version}"
    const val moshi = "com.squareup.moshi:moshi-kotlin:${Versions.kotlinMoshiVersion}"
    const val moshiAdapters = "com.squareup.moshi:moshi-adapters:${Versions.kotlinMoshiVersion}"
    const val moshiCodeGen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.kotlinMoshiVersion}"
    const val threeTenBp = "com.jakewharton.threetenabp:threetenabp:${Versions.threeTenBpVersion}"
    const val okio = "com.squareup.okio:okio:${Versions.okioVersion}"

    const val kotlinTest = "io.kotlintest:kotlintest:${Versions.kotlinTestVersion}"

}