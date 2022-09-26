package com.ratings.dataservice.ratings.dataservice.controller;

import com.ratings.dataservice.ratings.dataservice.pojo.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResourceController {
@GetMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){

    return new Rating(movieId,4);

    }
}
