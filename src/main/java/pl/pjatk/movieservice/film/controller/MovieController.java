package pl.pjatk.movieservice.film.controller;


import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.movieservice.film.model.Movies;
import pl.pjatk.movieservice.film.service.MovieService;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/start")
public class MovieController {
    private final MovieService movieService;
    private List<Movies> moviesList = new ArrayList<>();

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    //3B
    @GetMapping("/movies")
    public ResponseEntity<List<Movies>> getAllMovies() {
        return ResponseEntity.ok(movieService.getAllMovies());
    }

    //    @GetMapping("/movies")
//    public ResponseEntity<List<Movies>> getMovies() {
//        List<Movies> film = new ArrayList<>();
//        return ResponseEntity.ok(List.of());
//    }
    //3C
    @GetMapping("/movies/{id}}")
    public ResponseEntity<Movies> getMoviesByIdd(@PathVariable Long id) {
        return ResponseEntity.ok(movieService.getMovieById(id));
    }

    //consumes - type of resources accepted to use from client >> produces - type for client
    @PostMapping(value = "/movies", consumes = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Movies> create(@RequestBody Movies movies) {
        return ResponseEntity.ok(movieService.create(movies));
    }

    @PutMapping("/movies/{id}")
    public ResponseEntity<Movies> updateMovie(@PathVariable Long id, @RequestBody Movies updateMovie) {
        return ResponseEntity.ok(movieService.updateMovie(id, updateMovie));
    }

    @DeleteMapping("/movies/{id}")
    public ResponseEntity<Void> deleteMoviePathVar(@PathVariable Long id) {
//        boolean delete = movieService.deleteMovie(id))
        if(true) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @PutMapping("/movies/{id}")
    public ResponseEntity<Movies> updateAvailable(@PathVariable Long id, @RequestBody Movies movies) {
        return ResponseEntity.ok(movieService.updateAvailable(id,movies));
    }
}