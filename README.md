# SLF4J issue

```
./gradlew :slf4j-repro:test
```

# Configuration Issue

note: this doesn't happen without using `buildSrc`

```
./gradlew :missing-configuration-repro:build
```

# Log4j2 Issues

```
./gradlew :log4j-repro:bootRun
```
will show that whatever the log4j2 configuration is, it's not the same as the slf4j one, it doesn't have color, and this format is undocumented

```
./gradlew :log4j-repro:test
```

shows that if you copy the documented slf4j configuration it spews garbage.

These 2 things combined makes it hard to reproduce the console logging of slf4j in log4j2.
