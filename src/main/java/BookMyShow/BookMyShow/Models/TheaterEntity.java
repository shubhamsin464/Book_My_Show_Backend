package BookMyShow.BookMyShow.Models;


import jakarta.persistence.*;

@Entity
@Table(name = "Theater")
public class TheaterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

}
