package BookMyShow.BookMyShow.Models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Movie")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "MovieName",nullable = false,unique = true)
    private String name;


    private Date releaseDate;

    private int duration;

    @OneToMany(mappedBy = "movie",cascade = CascadeType.ALL)
    private List<ShowEntity> listOfShows;
}
