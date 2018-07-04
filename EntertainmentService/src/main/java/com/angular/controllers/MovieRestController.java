package com.angular.controllers;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.angular.models.Movie;

@CrossOrigin(maxAge = 3600)
@RestController
public class MovieRestController {
	
    private static final Logger LOGGER = LoggerFactory.getLogger(MovieRestController.class);

	@Autowired
	MongoTemplate mongoTemplate;

	@CrossOrigin(origins = "*")
	@PostMapping(path="/insertMovie",consumes = "application/json")
	public String insertMovie(@RequestBody Movie movie){
		LOGGER.info("***********insertMovie action called..");
		mongoTemplate.save(movie);
		return "successfully inserted sd!!";
		
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/getMovie/{id}")
	public ArrayList<Movie> getMovieById(@PathVariable String id){
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(Long.parseLong(id)));
		ArrayList<Movie> movie=(ArrayList<Movie>) mongoTemplate.find(query, Movie.class);
		return movie;
		
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping(path="/getMovies",produces="application/json")
	public ArrayList<Movie> getMovies(){
		LOGGER.info("**********getMovies action called..");

		ArrayList<Movie> movie=(ArrayList<Movie>) mongoTemplate.findAll(Movie.class);
		return movie;
		
	}
	
	@GetMapping(path="/welcome")
	public String getWelcomeMsg(){
		LOGGER.info("*****************getWelcomeMsg action called..");
		return "Welcome!!!!!!!!!!! Angular services New";
		
	}
	
	

}
