package pl.pjatk.movieservice.film.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.pjatk.movieservice.film.model.Movies;

@Repository
public interface MovieRepository extends JpaRepository<Movies, Long> {

    @Modifying
    @Transactional
    @Query ("update Movies m set m.isAvailable = :active where m.id = :id")
    void activateMovie(@Param("active") boolean active, @Param("id") Long id);




//    Movies create (Movies movies);
//    Movies save (Movies movies);
//    Movies findById(long id);
//    void deleteMoviesById(long id);

}
