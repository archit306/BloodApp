plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.bloodapp"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.bloodapp"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
}

dependencies {

    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")

    // RecyclerView
    implementation("androidx.recyclerview:recyclerview:1.3.0")

    // ConstraintLayout
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // User location
    implementation("com.google.android.gms:play-services-location:21.0.1")

    // ⭐ FIX: Upgrade coroutines to prevent Kotlin 1.6.0 from loading
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    // Testing
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
