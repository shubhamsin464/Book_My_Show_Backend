package BookMyShow.BookMyShow.Controller;


import BookMyShow.BookMyShow.Dto.UserRequestDto;
import BookMyShow.BookMyShow.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    UserService userService;

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody UserRequestDto userRequestDto){
        userService.create(userRequestDto);
        return new ResponseEntity<>("User created", HttpStatus.CREATED);
    }
}
