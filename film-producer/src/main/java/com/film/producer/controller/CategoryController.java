package com.film.producer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.film.producer.exception.FilmProducerApiException;
import com.film.producer.response.CategoryResponse;

@RestController
@RequestMapping("/v1/category")
public class CategoryController {
	
	@RequestMapping(method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CategoryResponse>> getAllCategory() throws FilmProducerApiException{
		final List<CategoryResponse> category = new ArrayList<>(1);
		try{
		category.add(new CategoryResponse.Builder()
				.withId(123)
				.withName("CAT A")
				.withLastUpdate("09-12-2016 13:40:25").build());
		String error = null;
		error.toString();
		}catch(final Exception ex){
			throw new FilmProducerApiException(FilmProducerApiException.ExceptionTypeData.CATEGORY_NOY_FOUND);
		}
		return new ResponseEntity<List<CategoryResponse>>(category, HttpStatus.OK);
	}
}
