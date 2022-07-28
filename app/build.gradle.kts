plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = Constants.compileSdk

    defaultConfig {
        applicationId = Constants.packageName
        minSdk = Constants.minSdk
        targetSdk = Constants.targetSdk
        versionCode = Constants.versionCode
        versionName = Constants.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = Versions.javaVersion
        targetCompatibility = Versions.javaVersion
    }

    kotlinOptions {
        jvmTarget = Versions.jvmVersion
    }

    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
}

dependencies {
    implementation(project(":data"))
    implementation(project(":domain"))

    KotlinDependencies.run {
        implementation(kotlin)
    }

    KtxDependencies.run {
        implementation(coreKtx)
    }

    AndroidXDependencies.run {
        implementation(appCompat)
        implementation(constraintLayout)
    }

    MaterialDependencies.run {
        implementation(material)
    }

    TestDependencies.run {
        implementation(jUnit)
        implementation(androidTest)
        implementation(espresso)
    }
}
