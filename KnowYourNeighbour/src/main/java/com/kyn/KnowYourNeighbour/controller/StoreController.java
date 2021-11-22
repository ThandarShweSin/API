package com.kyn.KnowYourNeighbour.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyn.KnowYourNeighbour.dao.Store;
import com.kyn.KnowYourNeighbour.service.StoreService;


@RestController
@RequestMapping("/online")
@CrossOrigin("http://localhost:3000")
public class StoreController {
	@Autowired
	private StoreService storeService;
		
	@GetMapping("/view-stores")
	
    @PreAuthorize("hasRole('USER')")
	
	public List<Store> viewStores(){
		List<Store> stores = storeService.viewStores();
		return stores;
		}
	
	//Get Product API (Get by Id)
		@GetMapping(value = "/store/{sid}")
		@PreAuthorize("hasRole('USER')")
		public Optional<Store> getStore(@PathVariable int sid){
			return storeService.getStore(sid);
		}
		
		//Search By Keyword 
		@GetMapping(value = "/store/search/{key}")
		@PreAuthorize("hasRole('USER')")
		public List<Store> searchByKey(@PathVariable String key){
			return storeService.searchByKey(key);
		}
		
		
}