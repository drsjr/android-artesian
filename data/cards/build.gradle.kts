plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")

}

android {
    namespace = "tour.donnees.data.cards"
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

    implementation(project(":data:base"))

    implementation(Dependencies.AndroidXCore)
    implementation(Dependencies.CoroutinesCore)
    implementation(Dependencies.Koin)

    testImplementation(Dependencies.Junit)
    testImplementation(Dependencies.AndroidXJunit)

    // define a BOM and its version
    implementation(platform(Dependencies.OkHttpPlatform))

    // define any required OkHttp artifacts without version
    implementation(Dependencies.OkHttp)
    implementation(Dependencies.OkHttpLoggingInterceptor)

    //Retrofit
    implementation(Dependencies.Retrofit)
    implementation(Dependencies.RetrofitConversteGson)

    //Gson
    implementation(Dependencies.Gson)
}