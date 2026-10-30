plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.daftarpostingan"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.example.daftarpostingan"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)

    // app/build.gradle.kts (Module :app)
    dependencies {
        // RecyclerView (versi stabil terbaru: 1.4.0)
        implementation("androidx.recyclerview:recyclerview:1.4.0")

        // Retrofit untuk REST API
        implementation("com.squareup.retrofit2:retrofit:3.0.0")
        implementation("com.squareup.retrofit2:converter-gson:3.0.0")
        implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")

        // Coroutines untuk memanggil fungsi suspend
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.10.1")
    }
}