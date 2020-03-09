package cst438.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import cst438.Movie;
import cst438.MovieRepository;

@Controller
public class MovieRating
{
   @Autowired
   MovieRepository movieRepository;
   
   @GetMapping("/movies")
   public String movieList(Model model) {
      Iterable<Movie> movies = movieRepository.findAllByOrderByTimeStampDesc();
      model.addAttribute("movies", movies);
      return "movie_list";
   }
   
   @PostMapping("/movies/new")
   public String processMovieForm(@Valid Movie movie, BindingResult result, 
         Model model) {
      if (result.hasErrors()) {
         return "movie_form";
      }
      movie.setTimeStamp(new java.util.Date().toString());
      movieRepository.save(movie);
      model.addAttribute("movie", movie);
      return "movie_show";
   }
   
   @GetMapping("/movies/new")
   public String newMovieRating(Model model) {
      Movie movie = new Movie();
      model.addAttribute("movie", movie);
      return "movie_form";
   }
}