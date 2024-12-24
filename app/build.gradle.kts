plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    kotlin("kapt")
}

android {
    namespace = "com.bignerdranch.android.photogallery"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.bignerdranch.android.photogallery"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation ("androidx.room:room-runtime:2.5.2") // Замените версию на актуальную
    kapt("androidx.room:room-compiler:2.5.2")
    implementation ("androidx.room:room-ktx:2.5.2")

    // ViewModel
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1") // Укажите последнюю версию
    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0") // Обновлено с 2.5.0
    implementation("com.squareup.retrofit2:converter-scalars:2.9.0") // Обновлено с 2.5.0
    implementation("com.squareup.retrofit2:converter-gson:2.9.0") // Обновлено с 2.4.0

    // Gson
    implementation("com.google.code.gson:gson:2.10.1") // Обновлено с 2.8.5

    // AndroidX
    implementation("androidx.appcompat:appcompat:1.6.1") // Оставлено без изменений
    implementation("androidx.constraintlayout:constraintlayout:2.1.4") // Оставлено без изменений
    implementation("com.google.android.material:material:1.9.0") // Оставлено без изменений
    implementation("androidx.recyclerview:recyclerview:1.3.1") // Обновлено с 1.0.0
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2") // Заменено на актуальную версию
    implementation("androidx.core:core-ktx:1.12.0") // Исправлено название и обновлено с 1.0.0
    implementation("androidx.work:work-runtime-ktx:2.8.1") // Оставлено без изменений
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}