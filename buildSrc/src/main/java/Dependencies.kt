package tour.donnees.artisan.dependencies


object AndroidX {
    const val coreKtx = "androidx.core:core-ktx:1.7.0"
    const val livecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.1"
    const val activityCompose = "androidx.activity:activity-compose:1.3.1"
    const val composeUI = "androidx.compose.ui:ui:1.1.1"
    const val composeUITooling = "androidx.compose.ui:ui-tooling-preview:1.1.1"
    const val composeMaterial = "androidx.compose.material:material:1.1.1"

}

object Tests {
    const val junit = "junit:junit:4.13.2"
    const val androidXTest = "androidx.test.ext:junit:1.1.3"
    const val espresso = "androidx.test.espresso:espresso-core:3.4.0"
    const val composeUITest = "androidx.compose.ui:ui-test-junit4:1.1.1"
}

object Debugs {
    const val composeUITooling = "androidx.compose.ui:ui-tooling:1.1.1"
    const val composeUITest =  "androidx.compose.ui:ui-test-manifest:1.1.1"
}

object Plugins {
    const val application = "com.android.application"
    const val kotlinAndroid = "org.jetbrains.kotlin.android"
}

object Hilt {
    const val androidHilt = "com.google.dagger:hilt-android:2.44"
    const val androidHiltCompiler = "com.google.dagger:hilt-android-compiler:2.44"
}