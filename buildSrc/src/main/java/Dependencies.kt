object KotlinDependencies {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinVersion}"
}

object AndroidXDependencies {
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
}

object KtxDependencies {
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
}

object TestDependencies {
    const val jUnit = "junit:junit:${Versions.jUnitVersion}"
    const val androidTest = "androidx.test.ext:junit:${Versions.androidTestVersion}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoVersion}"
}

object MaterialDependencies {
    const val material = "com.google.android.material:material:${Versions.materialVersion}"
}

object KaptDependencies

object ThirdPartyDependencies

object ClassPathPlugins
