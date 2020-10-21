import org.jooq.codegen.GenerationTool

val dbHost: String by project
val dbPort: String by project
val dbName: String by project
val dbUser: String by project

val config = """
    <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
    <configuration xmlns="http://www.jooq.org/xsd/jooq-codegen-3.13.0.xsd">
      <jdbc>
        <driver>org.postgresql.Driver</driver>
        <url>jdbc:postgresql://$dbHost:$dbPort/$dbName</url>
        <user>$dbUser</user>
      </jdbc>
    
      <generator>
        <name>org.jooq.codegen.KotlinGenerator</name>
        <database>
          <name>org.jooq.meta.postgres.PostgresDatabase</name>
          <inputSchema>public</inputSchema>
    
          <!-- All elements that are generated from your schema (A Java regular expression.
               Use the pipe to separate several expressions) Watch out for
               case-sensitivity. Depending on your database, this might be
               important!
               
               You can create case-insensitive regular expressions using this syntax: (?i:expr)
               
               Whitespace is ignored and comments are possible.
               -->
          <includes>.*</includes>
    
          <!-- All elements that are excluded from your schema (A Java regular expression.
               Use the pipe to separate several expressions). Excludes match before
               includes, i.e. excludes have a higher priority -->
          <excludes>flyway_schema_history</excludes>
        </database>
    
        <generate>
          <!-- Generation flags: See advanced configuration properties -->
        </generate>
    
        <target>
            <packageName>dev.gregopet.blabla</packageName>
            <directory>${projectDir}/src/main/kotlin</directory>
        </target>
      </generator>
    </configuration>
""".trimIndent()

buildscript {
    repositories {
        mavenCentral()
        jcenter()
    }
    dependencies {
        classpath("org.jooq:jooq:3.14.0")
        classpath("org.jooq:jooq-meta:3.14.0")
        classpath("org.jooq:jooq-codegen:3.14.0")
        classpath("org.postgresql:postgresql:42.2.16")
    }
}

tasks.create(name = "jooqModel") {
  group = "Build"
  description = "Generates the jOOQ model from the local database"

  doLast {
      GenerationTool.generate(config)
  }
}