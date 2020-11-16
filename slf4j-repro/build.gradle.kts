plugins {
  id("x.java-app")
}

dependencies {
  developmentOnly(platform("org.springframework.boot:spring-boot-starter-parent:2.4.+"))
  developmentOnly("org.springframework.boot:spring-boot-devtools")

  runtimeOnly("org.springframework.boot:spring-boot-starter-actuator")
  implementation("org.springframework.boot:spring-boot-starter-web")
  testImplementation("org.springframework.boot:spring-boot-starter-webflux")
}
