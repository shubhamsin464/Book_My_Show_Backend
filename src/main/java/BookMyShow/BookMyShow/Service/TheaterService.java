package BookMyShow.BookMyShow.Service;


import BookMyShow.BookMyShow.Dto.TheaterRequestDto;
import BookMyShow.BookMyShow.Enums.SeatType;
import BookMyShow.BookMyShow.Models.TheaterEntity;
import BookMyShow.BookMyShow.Models.TheaterSeatEntity;
import BookMyShow.BookMyShow.Repository.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TheaterService {
    @Autowired
    TheaterRepository theaterRepository;

    public String add(TheaterRequestDto theaterRequestDto){
        TheaterEntity theater = TheaterEntity.builder().name(theaterRequestDto.getName()).city(theaterRequestDto.getCity()).address(theaterRequestDto.getAddress()).build();
        List<TheaterSeatEntity> theaterSeats = createTheaterSeats();
        theater.setTheaterSeat(theaterSeats);//Bidirectional mapping
        for (TheaterSeatEntity theaterSeat:theaterSeats){
            theaterSeat.setTheater(theater);
        }
        theaterRepository.save(theater);
        return "theater added succesfully";
    }


    public List<TheaterSeatEntity> createTheaterSeats() {
        List<TheaterSeatEntity> seats = new ArrayList<>();
        for (int i=0;i<5;i++){
            char ch = (char)('A'+i);
            String seatNo="1"+ch;
            TheaterSeatEntity theaterSeat= new TheaterSeatEntity(seatNo,100, SeatType.CLASSIC);
            seats.add(theaterSeat);
        }
        for (int i=0;i<5;i++){
            char ch = (char)('A'+i);
            String seatNo="2"+ch;
            TheaterSeatEntity theaterSeat= new TheaterSeatEntity(seatNo,200, SeatType.PLATINUM);
            seats.add(theaterSeat);
        }
        return seats;
}
}


