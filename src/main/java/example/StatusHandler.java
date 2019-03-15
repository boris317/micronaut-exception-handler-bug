package example;

import io.micronaut.context.annotation.Replaces;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.http.server.exceptions.ExceptionHandler;
import io.micronaut.http.server.exceptions.HttpStatusHandler;

import javax.inject.Singleton;

@Singleton
@Replaces(HttpStatusHandler.class)
public class StatusHandler implements ExceptionHandler<HttpStatusException, String> {
    @Override
    public String handle(HttpRequest request, HttpStatusException exception) {
        return "FOUR OH FOUR";
    }
}
