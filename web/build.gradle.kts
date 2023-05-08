plugins {

    id(BuildPlugins.androidLibrary)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinAndroidExtensions)
    id(BuildPlugins.kotlinKapt)
}
android {
    compileSdkVersion(AndroidSdk.compileSdkVersion)
    defaultConfig {
        minSdkVersion(AndroidSdk.minSdkVersion)
        targetSdkVersion(AndroidSdk.targetSdkVersion)
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    sourceSets {
        getByName("main").java.setSrcDirs(listOf("src/main/java", "src/main/kotlin"))
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(fileTree("include" to "*.jar", "dir" to "libs"))
    implementation(Libraries.appCompat)
    implementation(Libraries.kotlin)
    implementation(Libraries.kotlinCoroutines)
    implementation(Libraries.kotlinReflect)
    implementation(Libraries.moshi)
    implementation(Libraries.moshiAdapters)
    implementation(Libraries.okHttp)
    implementation(Libraries.okio)
    implementation(Libraries.threeTenBp)
    implementation(Libraries.timber)

    kapt(Libraries.moshiCodeGen)

    testImplementation(Libraries.junit)
    testImplementation(Libraries.kotlinTest)
    androidTestImplementation(Libraries.runner)
    androidTestImplementation(Libraries.espresso)
}
repositories {
    mavenCentral()
}

androidExtensions {
    isExperimental = true
}
