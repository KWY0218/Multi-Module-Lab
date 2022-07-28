plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdk = Constants.compileSdk

    defaultConfig {
        minSdk = Constants.minSdk
        targetSdk = Constants.targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    compileOptions {
        sourceCompatibility = Versions.javaVersion
        targetCompatibility = Versions.javaVersion
    }
    kotlinOptions {
        jvmTarget = Versions.jvmVersion
    }
}

dependencies {
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

    TestDependencies.run {
        implementation(jUnit)
        implementation(androidTest)
        implementation(espresso)
    }
}
