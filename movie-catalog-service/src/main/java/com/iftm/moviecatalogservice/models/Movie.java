package com.iftm.moviecatalogservice.models;

public class Movie {

	
	
	private String movieId;
	private String name;
	
	//INDICA COMO GERAR UM OBJETO VAZIO DESSA CLASSE QUE DEPOIS SERA POPULADO
	public Movie() {
		super();
	}
	
	//INDICA COMO A CLASSE PODERÁ SER ACESSADA
	public Movie(String movieId, String name) {
		super();
		this.movieId = movieId;
		this.name = name;
	}
	
	// METODOS GET (PEGAR) E SET (SETAR)
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
