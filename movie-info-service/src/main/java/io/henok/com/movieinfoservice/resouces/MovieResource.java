package io.henok.com.movieinfoservice.resouces;

import io.henok.com.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieResource {

    @RequestMapping("/{movieId}")
    public Movie getMovies(@PathVariable("movieId") String movieId){

        return new Movie(movieId,"Test Name");
    }

    @RequestMapping("")
    public String getMovies(  ){

        return "Test Name";
    }
}
