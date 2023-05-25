package pl.pjatk.movieservice.film.service;

import org.springframework.stereotype.Service;
import pl.pjatk.movieservice.film.model.Movies;
import pl.pjatk.movieservice.film.repository.MovieRepository;

import java.util.List;

@Service
public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

//    public List<Movies> getAllMovies() {
//        return List.of();
//    }
    public List<Movies> getAllMovies() {
        return movieRepository.findAll();
    }

//    public Movies getMovieById(Long id) {
//        List<Movies> movies = new ArrayList<>();
//        movies.add(new Movies(11, "Test name", Category.ROMANCE));
//
//        Movies moviesById = null;
//        for (Movies movie : movies) {
//            if (movie.getId() == id) {
//                moviesById = movie;
//                break;
//            }
//        }
//        if (moviesById == null) {
//            // throw new RuntimeException();
//            throw new MovieNotFoundException(id);
//        } else {
//            return moviesById;
//        }
//        //    Optional<Movies> first = Optional.empty();
//        //      for (Movies movies : movies) { if (movies.getId() == id) { first = Optional.of(movies);
//        //                    break; } }
//        //               movies.stream().filter(movies -> movies.getId() == id).findFirst()
//    }


    public Movies saveMovie(Movies movies) {
        return movieRepository.save(movies);
    }

    public Movies getMovieById (Long id) {
        return movieRepository.findById(id).orElse(null);
    }

    public Movies updateMovie( Long id, Movies movies) {
        return movieRepository.save(movies);
    }

    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }


    public Movies create(Movies movies) {
        if (movies == null) {
            // throw new ServerException();
            return movies;
        } else {
            return movieRepository.create(movies);
        }
    }


//    public Movies updateMovie(Long id, Movies movies) {
//        Optional<Movies> updateMovies = movieRepository.findById(id);
//        if (updateMovies.isPresent()) {
//            movies.setName(movies.getName());
//            movies.setCategory(movies.getCategory());
//            return movieRepository.save(movies);
//        } else { return null; }
//    }

//    public Movies updateMovie(long id, Movies updateMovie) {
//        Movies movies = movieRepository.findById(id);
//        if (movies != null) {
//            movies.setName(updateMovie.getName());
//            movies.setCategory(updateMovie.getCategory());
//            return movieRepository.save(movies);
//        } else { return null; }
//    }
//
//
//    public boolean deleteMoviePathVar(Long id) {
//        Optional<Movies> getAndDeleteMovieById = movieRepository.findById(id);
//        if (getAndDeleteMovieById.isPresent()) {
//            Movies movies = getAndDeleteMovieById.get();
//            movieRepository.deleteMoviesById(id);
//            return true;
//        } else {
//            return false;
//        }
//    }

//    public boolean deleteMoviePathvar(Long id) {
//        Movies movies = movieRepository.findById(id);
//        if(movies != null) {
//            movieRepository.delete(movies);
//            return true;
//        } else {
//            return false;
//        }
//    }
}
