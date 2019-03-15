package example;

import io.micronaut.core.convert.exceptions.ConversionErrorException;
import io.micronaut.http.HttpResponse;

import javax.inject.Singleton;

@Singleton
public class ConversionExceptionHandler extends LoggingExceptionHandler<ConversionErrorException> {
    @Override
    HttpResponse handleError(ConversionErrorException exception) {
        return HttpResponse.badRequest("ConversionExceptionHandler");
    }
}
