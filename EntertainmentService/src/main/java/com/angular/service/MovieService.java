package com.angular.service;

import com.angular.models.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MovieService {

    public Movie insertMovie(Movie movie);
    public Optional<Movie> getMovieById(long id);
    public List<Movie> getMovies();
}
