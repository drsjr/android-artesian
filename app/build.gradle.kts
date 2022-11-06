import tour.donnees.artisan.dependencies.AndroidX
import tour.donnees.artisan.dependencies.Debugs
import tour.donnees.artisan.dependencies.Plugins
import tour.donnees.artisan.dependencies.Tests

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
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

    testImplementation (Tests.junit)

    androidTestImplementation (Tests.androidXTest)
    androidTestImplementation (Tests.espresso)
    androidTestImplementation (Tests.composeUITest)

    debugImplementation (Debugs.composeUITooling)
    debugImplementation (Debugs.composeUITest)
}