package example;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.server.exceptions.ExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

abstract class LoggingExceptionHandler<T extends Throwable> implements ExceptionHandler<T, HttpResponse> {
    private static final Logger LOG = LoggerFactory.getLogger(LoggingExceptionHandler.class);

    @Override
    public HttpResponse handle(HttpRequest request, T exception) {
        return handleError(exception);
    }

    abstract HttpResponse handleError(T exception);
}
