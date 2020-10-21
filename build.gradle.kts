val kotlinVersion = "1.4.0"

val dbHost: String by project
val dbPort: String by project
val dbName: String by project
val dbUser: String by project

plugins {
	kotlin("jvm").version("1.4.0")
	application
}
apply(from = "flyway.gradle.kts")
apply(from = "jooq.gradle.kts")

repositories {
	mavenCentral()
	jcenter()
}

dependencies {
	implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
	implementation("org.jetbrains.kotlin:kotlin-stdlib")
    runtimeOnly("org.postgresql:postgresql:42.2.16")
	implementation("org.jooq:jooq:3.14.0")
	implementation("org.jooq:jooq-kotlin:3.14.0")
}

java {
	sourceCompatibility = JavaVersion.VERSION_11
	targetCompatibility = JavaVersion.VERSION_11
}

tasks.wrapper {
	gradleVersion = "6.6.1"
}
