package com.product.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.product.demo.Entity.ProductDetails;
 


@RestController
public class ProductDetailsController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping(value ="/getAllInfo")
    
	public List<ProductDetails>getInfo(){
		String url1 = "http://localhost:8081/show"; //get mapping
		String url2 = "http://localhost:8082/percentage/";
		
		ResponseEntity<List<ProductDetails>> response1 =restTemplate.exchange(url1, HttpMethod.GET,null, new ParameterizedTypeReference<List<ProductDetails>>() {
	});
		List<ProductDetails>products= response1.getBody();
		products.forEach(x -> {
		int hsn = x.getHsn();
		
		ResponseEntity<Integer> response2 = restTemplate.exchange(url2+hsn, HttpMethod.GET,null, Integer.class);
		       int percentage = response2.getBody();
		       x.setPrice(x.getPrice() +(x.getPrice()*percentage/100));
		
		});
		
		return products;
		
	}

}
