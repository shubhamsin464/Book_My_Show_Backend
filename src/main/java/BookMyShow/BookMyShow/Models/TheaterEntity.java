package BookMyShow.BookMyShow.Models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Theater")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TheaterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String address;

    private String city;

    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
    List<ShowEntity> listOfShows;

    @OneToMany(mappedBy = "theater",cascade = CascadeType.ALL)
    List<TheaterSeatEntity> theaterSeat;


}
