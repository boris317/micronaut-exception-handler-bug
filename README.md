# micronaut-exception-handler-bug

This repo includes an app that reproduces a bug when you use a common base class for exception handling. 
`LoggingExceptionHandler` is an ABC that implements `ExceptionHandler`. The singleton bean `ConversionExceptionHandler` 
exends `LoggingExceptionHandler`.

If you start the app and force a `JsonParseException` it will end up being handled by `ConversionExceptionHandler` which should
only handle `ConversionErrorException`

```
./gradlew run
```

```
curl -H "Content-Type: application/json" -XPOST -d '{"world" ""}' http://localhost:8080/hello -v
```
