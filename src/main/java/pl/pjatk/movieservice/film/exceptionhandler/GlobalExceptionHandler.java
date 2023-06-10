package pl.pjatk.movieservice.film.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.ResourceAccessException;
import pl.pjatk.movieservice.film.exception.MovieNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MovieNotFoundException.class)
    public ResponseEntity<Object> handlerMovieNotFoundException (MovieNotFoundException ex ) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("`entity with id: " + ex.getMovieId() + " not found");
    }

    @ExceptionHandler(HttpClientErrorException.NotFound.class)
    public ResponseEntity<Void> handleNotFound1(HttpClientErrorException.NotFound exception) {
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(HttpClientErrorException.BadRequest.class)
    public ResponseEntity<Void> handleNotFound2(HttpClientErrorException.BadRequest exception) {
        return ResponseEntity.badRequest().build();
    }

    @ExceptionHandler(HttpServerErrorException.InternalServerError.class)
    public ResponseEntity<Void> handleNotFound3(HttpServerErrorException.InternalServerError exception) {
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).build();
    }

    @ExceptionHandler(ResourceAccessException.class)
    public ResponseEntity<Void> handleNotFound4(ResourceAccessException exception) {
        return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT).build();
    }



}
