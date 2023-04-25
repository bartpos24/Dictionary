plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.jetbrainsAndroid)
}

android {
    namespace = "com.example.dictionary"
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
        minSdkVersion(AndroidSdk.minSdkVersion)
        targetSdkVersion(AndroidSdk.targetSdkVersion)
        versionCode = 1
        versionName = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            signingConfig = signingConfigs.getByName("release")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(Libraries.core)
    implementation(Libraries.appCompat)
    implementation(Libraries.materialDesign)
    implementation(Libraries.constraintLayout)
    implementation(Libraries.lifecycleLivedata)
    implementation(Libraries.lifecycleViewModel)
    implementation(Libraries.navigationFragment)
    implementation(Libraries.navigationUI)
    testImplementation(Libraries.junit)
    androidTestImplementation(Libraries.testJunit)
    androidTestImplementation(Libraries.espresso)
}