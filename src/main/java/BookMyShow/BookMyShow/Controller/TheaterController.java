package BookMyShow.BookMyShow.Controller;


import BookMyShow.BookMyShow.Dto.TheaterRequestDto;
import BookMyShow.BookMyShow.Service.TheaterService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theater")
public class TheaterController {

    @Autowired
    TheaterService theaterService;

    @PostMapping("/add")
    public String add(@RequestBody TheaterRequestDto theaterRequestDto){
        return theaterService.add(theaterRequestDto);
    }
}
