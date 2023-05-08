const val kotlinVersion = "1.6.20"

object BuildPlugins {
    object Versions {
        const val ktlintVersion = "0.44.0"
        const val gradleVersion = "7.4.0-alpha07"
        const val jetifierVersion = "1.0.0-beta10"
        const val googleServicesVersion = "4.3.4"
    }

    const val androidApplication = "com.android.application"
    const val jetbrainsAndroid = "org.jetbrains.kotlin.android"

    const val openApiGenerator = "org.openapi.generator"
    const val spotless = "com.diffplug.gradle.spotless"

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.gradleVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val navigationPlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:${Libraries.Versions.navigationVersion}"
    const val jetifier = "com.android.tools.build.jetifier:jetifier-core:${Versions.jetifierVersion}"
    const val jetifierPlugin = "com.android.tools.build.jetifier:jetifier-processor:${Versions.jetifierVersion}"
    const val googleServicesPlugin = "com.google.gms:google-services:${Versions.googleServicesVersion}"

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
        const val lifecycleVersion = "2.6.1"
        const val navigationVersion = "2.3.5"
        const val junitVersion = "4.13"
        const val espressoVersion = "3.3.0-rc01"
        const val kotlinCoroutinesVersion = "1.6.0"
        const val timberVersion = "4.7.1"
        const val testRunnerVersion = "1.3.0-alpha03"
        const val lifeCycleSavedStateVersion = "1.0.0"
        const val testExtJunitVersion = "1.1.2-alpha03"
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
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigationVersion}"
    const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Versions.navigationVersion}"

    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
    const val kotlinCoroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinCoroutinesVersion}"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion"
    const val timber = "com.jakewharton.timber:timber:${Versions.timberVersion}"

    //lifecycle
    const val lifecycle = "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycleVersion}"
    const val lifecycleProcessLifecycleOwner = "androidx.lifecycle:lifecycle-process:${Versions.lifecycleVersion}"
    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleVersion}"
    const val lifecycleVievModelSavedState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.lifeCycleSavedStateVersion}"

    //web
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp3Version}"
    const val okHttpBrotliInterceptor = "com.squareup.okhttp3:okhttp-brotli:${Versions.okHttp3Version}"
    const val okHttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp3Version}"
    const val moshi = "com.squareup.moshi:moshi-kotlin:${Versions.kotlinMoshiVersion}"
    const val moshiAdapters = "com.squareup.moshi:moshi-adapters:${Versions.kotlinMoshiVersion}"
    const val moshiCodeGen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.kotlinMoshiVersion}"
    const val threeTenBp = "com.jakewharton.threetenabp:threetenabp:${Versions.threeTenBpVersion}"
    const val okio = "com.squareup.okio:okio:${Versions.okioVersion}"

    //test
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoVersion}"
    const val junit = "junit:junit:${Versions.junitVersion}"
    const val kotlinTest = "io.kotlintest:kotlintest:${Versions.kotlinTestVersion}"
    const val junitExtensions = "androidx.test.ext:junit:${Versions.testExtJunitVersion}"
    const val runner = "androidx.test:runner:${Versions.testRunnerVersion}"

}