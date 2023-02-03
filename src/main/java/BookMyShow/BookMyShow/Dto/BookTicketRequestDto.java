package BookMyShow.BookMyShow.Dto;


import lombok.Data;

import java.util.List;

@Data
public class BookTicketRequestDto {
   private List<String> seats;
   private int showId;
   private int userId;
}
