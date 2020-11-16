import org.gradle.api.tasks.testing.logging.TestLogEvent

group = "com.xenoterracide"
version = "0.1.0-SNAPSHOT"

plugins {
  `java-library`
  `java-test-fixtures`
}

repositories {
  mavenCentral()
}

dependencies {
  implementation(platform("org.springframework.boot:spring-boot-starter-parent:2.4.0"))
  // Use JUnit Jupiter API for testing.
  testImplementation("org.springframework:spring-test")
  testImplementation("org.springframework.boot:spring-boot-test")
  testImplementation("org.springframework.boot:spring-boot-test-autoconfigure")
  testImplementation("org.junit.jupiter:junit-jupiter-api")
  testImplementation("org.junit.jupiter:junit-jupiter-params")
  testImplementation("org.assertj:assertj-core")
  testImplementation("org.mockito:mockito-core")
  // Use JUnit Jupiter Engine for testing.
  testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.test {
  // Use junit platform for unit tests.
  useJUnitPlatform()

  testLogging {
    lifecycle {
      showStandardStreams = true
      displayGranularity = 2
      events.addAll(listOf(TestLogEvent.STARTED, TestLogEvent.PASSED, TestLogEvent.SKIPPED, TestLogEvent.FAILED))
    }
  }
  reports {
    html.isEnabled = false
    junitXml.isEnabled = false
  }
}

java {
  toolchain {
    languageVersion.set(JavaLanguageVersion.of(11))
  }
}
