# GeekSeat Online Test

## We create project using command

```angular2html
mvn archetype:generate -DgroupId=com.odenktools.app -DartifactId=GeekSeatSaga -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## Running and Test application

compile first and also it's running unit-test

```bash
mvn package
```

to running an app

```bash
mvn exec:java -Dexec.mainClass=com.odenktools.app.App
```
