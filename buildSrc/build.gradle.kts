group = "com.xenoterracide"
version = "0.1.0-SNAPSHOT"

plugins {
  `kotlin-dsl`
}

repositories {
  gradlePluginPortal() // so that external plugins can be resolved in dependencies section
}

dependencies {
  implementation("com.diffplug.spotless:spotless-plugin-gradle:5.8.1")
  implementation("gradle.plugin.com.github.spotbugs.snom:spotbugs-gradle-plugin:4.+")
  implementation("net.ltgt.gradle:gradle-errorprone-plugin:1.+")
  implementation("net.ltgt.gradle:gradle-nullaway-plugin:1.+")
  implementation("org.springframework.boot:spring-boot-gradle-plugin:2.4.+")
}

