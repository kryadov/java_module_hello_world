# java_module_hello_world
Java modularization example in 2 parts: 2 dependent modules and module which used vulnerable components.

## JAVA_HOME is required with Java 9+
E.g. set ```export JAVA_HOME=~/Java/zulu/17```

## 2 dependent modules example
### Build
`./build.sh`

### Run
`./run.sh`
Result should be
```shell
Hello, Modules!
```

## module which used vulnerable components
Jackson Databind and Log4j2 are used - see `build.gradle` dependencies.
### Build
```shell
./gradlew assemble
./gradlew jlink
```

### Run
```./run_image.sh```
Result should be 
```shell
JndiLookup: null
Result is: b
```
