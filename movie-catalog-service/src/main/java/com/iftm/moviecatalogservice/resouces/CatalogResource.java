package com.iftm.moviecatalogservice.resouces;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.iftm.moviecatalogservice.models.CatalogItem;
import com.iftm.moviecatalogservice.models.Movie;
import com.iftm.moviecatalogservice.models.Rating;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {

	@Autowired
		private RestTemplate restTemplate;
		
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCAtalog(@PathVariable("userId") String userId) {
		
		// 1- obter todos os movieIds
		List<Rating> ratings = Arrays.asList(
				new Rating("12", 5), 
				new Rating("15", 2));

	//UserRatings ratings =	restTemplate.getForObject("http://localhost:8083/ratingsdata/users/" + rating.getMovieId(), Movie.class);
		
		return ratings.stream().map(rating -> {
			// 2- para cada movieId, chamar movie info service e get details
			Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), Movie.class);
			return new CatalogItem(movie.getName(), "FILMÃO", rating.getRating());
		})
				// 3 colocar tudo junto
				.collect(Collectors.toList());

		// return Collections.singletonList(new CatalogItem("Caça Fantasma", "Filme de
		// Gasparzinho", 8));
	}
}
