package BookMyShow.BookMyShow.Service;

import BookMyShow.BookMyShow.Dto.UserRequestDto;
import BookMyShow.BookMyShow.Models.UserEntity;
import BookMyShow.BookMyShow.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void create(UserRequestDto userRequestDto){

        UserEntity userEntity = UserEntity.builder().name(userRequestDto.getName()).mobile(userRequestDto.getMobile()).build();
        userRepository.save(userEntity);
    }
}
