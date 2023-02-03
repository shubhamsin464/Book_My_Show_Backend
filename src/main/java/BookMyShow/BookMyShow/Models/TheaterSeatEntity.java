package BookMyShow.BookMyShow.Models;


import BookMyShow.BookMyShow.Enums.SeatType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Table(name = "TheaterSeat")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TheaterSeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String seatNo;

    private int rate;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    @ManyToOne
    @JoinColumn
    private TheaterEntity theater;

    public TheaterSeatEntity(String seatNo, int rate, SeatType seatType) {
        this.seatNo = seatNo;
        this.rate = rate;
        this.seatType = seatType;
    }
}
