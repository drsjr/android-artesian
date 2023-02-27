plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = AndroidConfig.namespace
    compileSdk = AndroidConfig.compileSdk

    defaultConfig {
        minSdk = AndroidConfig.minSdk
        targetSdk = AndroidConfig.targetSdk

        testInstrumentationRunner = AndroidConfig.testInstrumentationRunner

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

    implementation(Dependencies.AndroidXCore)
    implementation(Dependencies.CoroutinesCore)
    implementation(Dependencies.Koin)

    // define a BOM and its version
    implementation(platform(Dependencies.OkHttpPlatform))

    // define any required OkHttp artifacts without version
    implementation(Dependencies.OkHttp)
    implementation(Dependencies.OkHttpLoggingInterceptor)

    testImplementation(Dependencies.Junit)
    testImplementation(Dependencies.AndroidXJunit)
}