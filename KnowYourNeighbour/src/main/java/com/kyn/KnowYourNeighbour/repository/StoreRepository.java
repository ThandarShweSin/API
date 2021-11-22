package com.kyn.KnowYourNeighbour.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kyn.KnowYourNeighbour.dao.Store;




@Repository
public interface StoreRepository extends JpaRepository<Store, Integer>{

	@Query(value = "SELECT s FROM Store s WHERE storeName LIKE '%' || :key ||  '%'" + 
			"OR storeLocation LIKE '%' || :key ||  '%' " + 
			"OR storePhoneNumber LIKE '%' || :key ||  '%' ")
	public List<Store> searchByKey(@Param("key") String key);
}