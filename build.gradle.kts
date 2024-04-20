import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
    kotlin("multiplatform") version "1.9.0"
    `maven-publish`
}

group = "ru.landgrafhomyak.utility"
version = "1.0"

repositories {
    mavenCentral()
    maven("https://maven.landgrafhomyak.ru/")
}


kotlin {
    jvm {
        jvmToolchain(8)
        withJava()
    }
    js {
        browser()
        nodejs()
    }

    linuxArm64()
    linuxX64()
    mingwX64()
    androidNativeArm32()
    androidNativeArm64()
    androidNativeX64()
    androidNativeX86()

    macosArm64()
    macosX64()
    iosArm64()
    iosSimulatorArm64()
    iosX64()
    ios()
    tvos()
    watchos()

//    wasm()

    sourceSets {
        val commonMain by getting {
            dependencies {
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }

        /*
        val jvmMain by getting {
            dependsOn(commonMain)
        }
        val jvmTest by getting {
            dependsOn(commonTest)
        }

        val _commonImplMain by creating {
            dependsOn(commonMain)
        }
        val _commonImplTest by creating {
            dependsOn(commonTest)
        }

        this
            .filter { ss -> ss.name.endsWith("Main") }
            .filter { ss -> ss.name !in arrayOf("commonMain", "jvmMain", "_commonImplMain") }
            .forEach { ss -> ss.dependsOn(_commonImplMain) }
        this
            .filter { ss -> ss.name.endsWith("Test") }
            .filter { ss -> ss.name !in arrayOf("commonTest", "jvmTest", "_commonImplTest") }
            .forEach { ss -> ss.dependsOn(_commonImplTest) }
        */
    }
}

tasks.withType<KotlinCompilationTask<*>>().all {
    compilerOptions.freeCompilerArgs.addAll(
        "-Xno-call-assertions",
        "-Xno-param-assertions",
        "-Xno-receiver-assertions"
    )
}