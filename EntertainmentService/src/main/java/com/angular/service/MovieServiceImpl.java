package com.angular.service;

import com.angular.controllers.MovieRestController;
import com.angular.models.Movie;
import com.angular.repository.MovieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService{
    private static final Logger LOGGER = LoggerFactory.getLogger(MovieServiceImpl.class);
    @Autowired
    MovieRepository movieRepo;

    @Override
    public Movie insertMovie(Movie movie) {
        LOGGER.info("--inside insertMovie service method---");
        return movieRepo.save(movie);
    }

    @Override
    public Optional<Movie> getMovieById(long id) {
        LOGGER.info("--inside getMovieById service method---");
        return movieRepo.findById(id);
    }

    @Override
    public List<Movie> getMovies() {
        LOGGER.info("--inside getMovies service method---");
        try{
            int i=10/0;
        } catch(Exception e){
            LOGGER.error("Error Occured ----- "+e);
        }
        return movieRepo.findAll();
    }
}
