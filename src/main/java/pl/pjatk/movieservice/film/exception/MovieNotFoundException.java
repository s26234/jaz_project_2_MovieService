package pl.pjatk.movieservice.film.exception;

public class MovieNotFoundException extends RuntimeException {

    private final long movieId;

    public MovieNotFoundException(Long movieId) {
        this.movieId = movieId;
    }

    public Long getMovieId() {
        return movieId;
    }
}
