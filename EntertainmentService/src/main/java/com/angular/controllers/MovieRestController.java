package com.angular.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.angular.service.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.angular.models.Movie;


@RestController
public class MovieRestController {
	
    private static final Logger LOGGER = LoggerFactory.getLogger(MovieRestController.class);

	@Autowired
	MovieService movieService;

	@PostMapping(path="/insertMovie",consumes = "application/json")
	public Movie insertMovie(@RequestBody Movie movie){
		LOGGER.info("***********insertMovie action called..");
		Movie movie1=new Movie();
		try{
			movie1=movieService.insertMovie(movie);
		}catch (Exception e){
			LOGGER.error("Exception Occured While inserting data "+e);
		}

		return movie1;
		
	}

	@GetMapping("/getMovie/{id}")
	public Optional<Movie> getMovieById(@PathVariable String id){
		LOGGER.info("***********getMovieById action called..");

		Optional<Movie> movie= movieService.getMovieById(Long.parseLong(id));
		return movie;
		
	}
	

	@GetMapping(path="/getMovies",produces="application/json")
	public ArrayList<Movie> getMovies(){
		LOGGER.info("**********getMovies action called..");

		ArrayList<Movie> movie=(ArrayList<Movie>) movieService.getMovies();
		return movie;
		
	}
	
	@GetMapping(path="/welcome")
	public String getWelcomeMsg(){
		LOGGER.info("*************getWelcomeMsg action called..");
		return "Welcome!!!!!!!!!!! Angular services New";
		
	}
	
	

}
