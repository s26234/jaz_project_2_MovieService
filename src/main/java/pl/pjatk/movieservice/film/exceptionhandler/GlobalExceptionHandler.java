package pl.pjatk.movieservice.film.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pl.pjatk.movieservice.film.exception.MovieNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MovieNotFoundException.class)
    public ResponseEntity<Object> handlerMovieNotFoundException (MovieNotFoundException ex ) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("`entity with id: " + ex.getMovieId() + " not found");
    }
}
