package com.iftm.moviecatalogservice.models;

import java.util.List;

public class UserRating {

	private String userId;
	private List<Rating> Ratings;
	
	
	
	public UserRating() {
		super();
	}

	public UserRating(String userId, List<Rating> ratings) {
		super();
		this.userId = userId;
		Ratings = ratings;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<Rating> getRating() {
		return Ratings;
	}
	public void setRating(List<Rating> rating) {
		Ratings = rating;
	}
	
	
	
}
