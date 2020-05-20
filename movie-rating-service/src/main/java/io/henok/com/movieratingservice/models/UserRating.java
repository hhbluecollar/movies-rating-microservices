package io.henok.com.movieratingservice.models;

import java.util.List;

public class UserRating {

    private List<Rating> userTating;


    public List<Rating> getUserTating() {
        return userTating;
    }

    public void setUserTating(List<Rating> userTating) {
        this.userTating = userTating;
    }
}
