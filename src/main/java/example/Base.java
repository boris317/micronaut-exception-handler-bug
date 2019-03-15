package example;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Error;

public abstract class Base {
    //@Error(status = HttpStatus.NOT_FOUND, global = true)
    public String handle404() {
        return "404!";
    }
}
