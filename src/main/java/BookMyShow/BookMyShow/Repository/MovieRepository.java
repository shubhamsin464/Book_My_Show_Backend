package BookMyShow.BookMyShow.Repository;

import BookMyShow.BookMyShow.Models.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity,Integer> {

}
