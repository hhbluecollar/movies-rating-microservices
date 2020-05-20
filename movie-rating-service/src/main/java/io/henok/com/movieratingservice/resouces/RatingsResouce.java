package io.henok.com.movieratingservice.resouces;

import io.henok.com.movieratingservice.models.Rating;
import io.henok.com.movieratingservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.netty.udp.UdpServer;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("ratingsdata")
public class RatingsResouce {



    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){

        return new Rating(movieId, 4);
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId){

        List<Rating> ratings = Arrays.asList(
                new Rating("1234",4),
                new Rating("5617",3)
        );

        UserRating userRating = new UserRating();
        userRating.setUserTating(ratings);
        return userRating;
    }
}
