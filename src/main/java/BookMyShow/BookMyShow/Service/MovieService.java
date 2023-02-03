package BookMyShow.BookMyShow.Service;

import BookMyShow.BookMyShow.Dto.MovieRequestDto;
import BookMyShow.BookMyShow.Models.MovieEntity;
import BookMyShow.BookMyShow.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public String addMovie(MovieRequestDto movieRequestDto){
        MovieEntity movie = MovieEntity.builder().name(movieRequestDto.getMovieName()).releaseDate(movieRequestDto.getReleaseDate()).duration(movieRequestDto.getDuration()).build();
        movieRepository.save(movie);
        return "Movie added succesfully";
    }
}
