package com.iftm.moviecatalogservice.resouces;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iftm.moviecatalogservice.models.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCAtalog(@PathVariable("userId") String userId) {

		return Collections.singletonList(new CatalogItem("Transformers", "Filme de Robô", 4));
	}
}
