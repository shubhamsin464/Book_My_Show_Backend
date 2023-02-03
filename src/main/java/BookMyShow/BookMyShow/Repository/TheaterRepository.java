package BookMyShow.BookMyShow.Repository;

import BookMyShow.BookMyShow.Models.TheaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<TheaterEntity,Integer> {
}
