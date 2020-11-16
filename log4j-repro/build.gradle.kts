plugins {
  id("x.java-app")
}

val sbVersion = "2.4.0"
dependencies {
  developmentOnly(platform("org.springframework.boot:spring-boot-starter-parent:$sbVersion"))
  developmentOnly("org.springframework.boot:spring-boot-devtools")

  runtimeOnly("org.springframework.boot:spring-boot-starter-actuator")
  implementation("org.springframework.boot:spring-boot-starter-web")
  testImplementation("org.springframework.boot:spring-boot-starter-webflux")
}

configurations.all {
  resolutionStrategy.dependencySubstitution {

    substitute(module("org.springframework.boot:spring-boot-starter-logging:$sbVersion"))
      .using(module("org.springframework.boot:spring-boot-starter-log4j2:$sbVersion"))
      .because("replace slf4j with log4j2")
  }
}
