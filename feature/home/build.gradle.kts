plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "tour.donnees.artisan.home"
    compileSdk = 33

    defaultConfig {
        minSdk = 24
        targetSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(project(":domain:base"))
    implementation(project(":domain:cards"))
    implementation(project(":arch:core"))
    implementation(project(":arch:designsystem"))

    implementation(Dependencies.Coil)
    implementation(Dependencies.CoilCompose)

    implementation(Dependencies.LiveDataCompose)

    implementation(Dependencies.Koin)

    implementation(Dependencies.AndroidXCore)
    implementation(Dependencies.AndroidXLifecycleRuntime)
    implementation(Dependencies.ActiviryCompose)
    implementation(Dependencies.ComposeUI)
    implementation(Dependencies.ComposeUIToolsPreview)
    implementation(Dependencies.ComposeMaterial)

    testImplementation(Dependencies.Junit)
    androidTestImplementation(Dependencies.AndroidXJunit)
    androidTestImplementation(Dependencies.Espresso)
    androidTestImplementation(Dependencies.ComposeUITest)
    debugImplementation(Dependencies.ComposeUITooling)
    debugImplementation(Dependencies.ComposeUITestManifest)
}