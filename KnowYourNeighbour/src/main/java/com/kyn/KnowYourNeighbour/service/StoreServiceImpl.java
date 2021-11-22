package com.kyn.KnowYourNeighbour.service;


import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyn.KnowYourNeighbour.dao.Store;
import com.kyn.KnowYourNeighbour.repository.StoreRepository;



@Service
@Transactional
public class StoreServiceImpl implements StoreService{

	@Autowired
	private StoreRepository storeRepo;

	@Override
	public List<Store> viewStores() {
		return storeRepo.findAll();
	}

	@Override
	public Optional<Store> getStore(int sid) {
		return storeRepo.findById(sid);
	}

	@Override
	public List<Store> searchByKey(String key) {
		return storeRepo.searchByKey(key);
	}

}