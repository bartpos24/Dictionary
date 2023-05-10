plugins {
    id(BuildPlugins.androidApplication)
    //id(BuildPlugins.jetbrainsAndroid)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinAndroidExtensions)
    id(BuildPlugins.androidNavigationSafeArgs)
    id(BuildPlugins.kotlinKapt)
    //id(BuildPlugins.googleServices)
}

android {
    //namespace = "com.example.dictionary"
    compileSdkVersion(AndroidSdk.compileSdkVersion)

    signingConfigs {
        create("release") {
            storeFile = file("$rootDir/keystore/dictionaty-release.jks")
            storePassword = "dictionary2023"
            keyAlias = "dictionary"
            keyPassword = "dictionary2023"
        }
    }

    defaultConfig {
        applicationId = "com.example.dictionary"
        applicationIdSuffix = "App"
        minSdkVersion(AndroidSdk.minSdkVersion)
        targetSdkVersion(AndroidSdk.targetSdkVersion)
        versionCode = 1
        versionName = "1.0.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
            signingConfig = signingConfigs.getByName("release")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs = listOf("-Xallow-result-return-type")
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(fileTree("include" to "*.jar", "dir" to "libs"))

    implementation(Libraries.core)
    implementation(Libraries.appCompat)
    implementation(Libraries.materialDesign)
    implementation(Libraries.constraintLayout)
    implementation(Libraries.navigationFragment)
    implementation(Libraries.navigationUI)
    testImplementation(Libraries.junit)
    androidTestImplementation(Libraries.junitExtensions)
    androidTestImplementation(Libraries.espresso)
    androidTestImplementation(Libraries.runner)

    //lifecycle
    implementation(Libraries.lifecycle)
    implementation(Libraries.lifecycleProcessLifecycleOwner)
    implementation(Libraries.lifecycleVievModelSavedState)
    implementation(Libraries.lifecycleLivedata)
    implementation(Libraries.lifecycleViewModel)
    //web
    implementation(Libraries.okHttp)
    implementation(Libraries.okHttpBrotliInterceptor)
    implementation(Libraries.okHttpLoggingInterceptor)
    implementation(Libraries.moshi)
    implementation(Libraries.moshiAdapters)
    implementation(Libraries.threeTenBp)
    kapt(Libraries.moshiCodeGen)
    kapt(BuildPlugins.jetifier)
    annotationProcessor(BuildPlugins.jetifier)


    implementation(project("path" to ":web"))
}