import org.jetbrains.compose.*  // ✅ Compose DSL 인식용

plugins {
    kotlin("jvm") version "1.9.22"                // ✅ Compose 1.6.10과 호환
    id("org.jetbrains.compose") version "1.6.10"  // ✅ 반드시 포함
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    google()  // ✅ AndroidX 라이브러리용 (필수)
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    implementation(compose.desktop.currentOs)     // ✅ Compose Desktop 엔진
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")
    testImplementation(kotlin("test"))
}

compose.desktop {
    application {
        mainClass = "MainKt"   // ✅ Main.kt의 main() 함수 진입점
    }
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}
