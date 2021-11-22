package com.kyn.KnowYourNeighbour.service;
import java.util.List;
import java.util.Optional;

import com.kyn.KnowYourNeighbour.dao.Store;


public interface StoreService {
	public List<Store> viewStores();
	public Optional<Store> getStore(int sid);
	public List<Store> searchByKey(String key);

}