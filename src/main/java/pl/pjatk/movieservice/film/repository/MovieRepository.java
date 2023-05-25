package pl.pjatk.movieservice.film.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pjatk.movieservice.film.model.Movies;

@Repository
public interface MovieRepository extends JpaRepository<Movies, Long> {


    Movies create (Movies movies);
//    Movies save (Movies movies);
//    Movies findById(long id);
//    Movies deleteMoviesById(long id);




}
