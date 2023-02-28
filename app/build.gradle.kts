plugins {
    id(ArtisanPlugins.androidApplication)
    id(ArtisanPlugins.kotlinAndroid)
}

android {
    namespace = AndroidConfig.namespace
    compileSdk = AndroidConfig.compileSdk

    defaultConfig {
        applicationId = AndroidConfig.applicationId
        minSdk = AndroidConfig.minSdk
        targetSdk = AndroidConfig.targetSdk
        versionCode = AndroidConfig.versionCode
        versionName = AndroidConfig.versionName
        testInstrumentationRunner = AndroidConfig.testInstrumentationRunner

    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles("proguard-android-optimize.txt", "proguard-rules.pro")
        }
        getByName("debug") {
            isMinifyEnabled = false
            isShrinkResources = false
            isDebuggable = true
            proguardFiles("proguard-android-optimize.txt", "proguard-rules.pro")
        }
    }

    /*lint {
        warningsAsErrors = true
        abortOnError = true
        htmlReport = true
        checkDependencies = true

        lintConfig = file("${rootDir}/config/filters/lint.xml")
        htmlOutput = file("${buildDir}/reports/lint.html")
    }*/

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
        resources.excludes.apply {
            add("META-INF/AL2.0")
            add("META-INF/LGPL2.1")
        }
    }
}

dependencies {

    implementation(project(":domain:base"))
    implementation(project(":domain:cards"))
    implementation(project(":arch:core"))

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