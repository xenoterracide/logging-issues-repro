group = "com.xenoterracide"
version = "0.1.0-SNAPSHOT"

plugins {
  `kotlin-dsl`
}

repositories {
  gradlePluginPortal() // so that external plugins can be resolved in dependencies section
}

dependencies {
  implementation("org.springframework.boot:spring-boot-gradle-plugin:2.4.0")
}

