plugins {
id("org.springframework.boot") version "3.2.2"
id("io.spring.dependency-management") version "1.1.0"
kotlin("jvm") version "1.9.10"
kotlin("plugin.spring") version "1.9.10"
}


group = "com.example"
version = "0.0.1"
java.sourceCompatibility = JavaVersion.VERSION_17


repositories {
mavenCentral()
}


dependencies {
implementation("org.springframework.boot:spring-boot-starter-web")
implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
implementation("org.jetbrains.kotlin:kotlin-reflect")
runtimeOnly("org.postgresql:postgresql")
testImplementation("org.springframework.boot:spring-boot-starter-test")
}


tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
kotlinOptions.jvmTarget = "17"
}


// Allow building a fat jar
tasks.named<Jar>("jar") {
enabled = true
}


springBoot {
buildInfo()
}
