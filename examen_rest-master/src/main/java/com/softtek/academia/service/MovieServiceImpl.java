package com.softtek.academia.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.academia.entity.Movie;
import com.softtek.academia.repository.MovieRepository;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieRepository repository;

	@Override
	public List<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return (List<Movie>) repository.findAll();
	}

	@Override
	public Movie getMovieById(Integer id) {
		// TODO Auto-generated method stub
		Movie movie = this.repository.findById(id).orElse(null);
		return movie;
	}

	@Override
	public Movie saveMovie(Movie Movie) {
		// TODO Auto-generated method stub
		repository.save(Movie);
		return Movie;
	}

	@Override
	public void deleteMovieById(Integer id) {
		// TODO Auto-generated method stub
		this.repository.deleteById(id);
		
	}

	@Override
	public Movie updateMovie(Movie Movie) {
		// TODO Auto-generated method stub
		this.repository.save(Movie);
		return Movie;
	}

	
	
	
}
