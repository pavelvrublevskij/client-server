All required links you can find at [help](HELP.md)

To run this api project you do not need to install gradle to your computer.
Just use gradlew in your console. See How-To scope.

Note! If you want to install gradle to your computer use official gradle page https://gradle.org/ how to do it.

##Requirements
* Language JAVA 11
* Gradle 6.3

##How-To
####Gradle
To check if gradle works correctly, just run:
```
gradlew clean build
```
or (if installed):
```
gradle clean build
```

####Api
Run api:
```
gradlew bootRun
```
or
```
gradlew clean bootJar
java -jar build/libs/pvexample-api.jar
```
