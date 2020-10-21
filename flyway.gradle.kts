import org.flywaydb.gradle.task.FlywayMigrateTask

val dbUser: String by project
val dbHost: String by project
val dbPort: String by project
val dbName: String by project

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.flywaydb:flyway-gradle-plugin:7.0.4")
    }
}

apply<org.flywaydb.gradle.FlywayPlugin>()

tasks.withType<FlywayMigrateTask> {
	url = "jdbc:postgresql://$dbHost:$dbPort/$dbName"
	user = dbUser
	locations = arrayOf("filesystem:migration")
}