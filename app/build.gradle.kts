import tour.donnees.artisan.dependencies.AndroidX
import tour.donnees.artisan.dependencies.Debugs
import tour.donnees.artisan.dependencies.Tests
import tour.donnees.artisan.dependencies.Hilt

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")

}

android {
    namespace = "tour.donnees.artisan"
    compileSdk = 32

    defaultConfig {
        applicationId  = "tour.donnees.artisan"
        minSdk = 28
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            isDebuggable = false
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }

        getByName("debug") {
            isDebuggable = true
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
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.1.1"
    }
    packagingOptions {
        exclude("META-INF/DEPENDENCIES")
        exclude("META-INF/LICENSE")
        exclude("META-INF/LICENSE.txt")
        exclude("META-INF/license.txt")
        exclude("META-INF/NOTICE")
        exclude("META-INF/NOTICE.txt")
        exclude("META-INF/notice.txt")
        exclude("META-INF/ASL2.0")
        exclude("META-INF/AL2.0")
        exclude("META-INF/LGPL2.1")
        exclude("META-INF/*.kotlin_module")
    }
}

dependencies {

    implementation (AndroidX.coreKtx)
    implementation (AndroidX.livecycleRuntime)
    implementation (AndroidX.activityCompose)
    implementation (AndroidX.composeUI)
    implementation (AndroidX.composeUITooling)
    implementation (AndroidX.composeMaterial)
    runtimeOnly("androidx.lifecycle:lifecycle-viewmodel-compose:2.5.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.5.1")

    testImplementation (Tests.junit)

    androidTestImplementation (Tests.androidXTest)
    androidTestImplementation (Tests.espresso)
    androidTestImplementation (Tests.composeUITest)

    debugImplementation (Debugs.composeUITooling)
    debugImplementation (Debugs.composeUITest)

    //Hilt
    implementation (Hilt.androidHilt)
    kapt (Hilt.androidHiltCompiler)

    //Hilt for test https://developer.android.com/training/dependency-injection/hilt-testing?hl=pt-br

    //Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.3.9")

    //Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")

    //Gson
    implementation("com.google.code.gson:gson:2.10")

}

kapt {
    correctErrorTypes = true

}