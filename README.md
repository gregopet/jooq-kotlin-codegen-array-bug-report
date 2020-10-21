# Bug report for jOOQ Kotlin codegen

The generated `src/main/kotlin/dev/gregopet/blabla/tables/Hamburger.kt` contains code that does not compile.

run `./gradlew flywayMigrate jooqModel compileKotlin` (replace first part for `gradle.bat` on Windows) and be sure to modify `gradle.properties` if the database isn't the one from the included `docker-compose.yaml`