package com.kyn.KnowYourNeighbour.dao;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Store {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int storeId;
	
	@Column(nullable = false)
	private String storeName;
	
	@Column(nullable = false)
	private String storeLocation;
	
	@Column(nullable = false)
	private String storePhoneNumber;

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreLocation() {
		return storeLocation;
	}

	public void setStoreLocation(String storeLocation) {
		this.storeLocation = storeLocation;
	}

	public String getStorePhoneNumber() {
		return storePhoneNumber;
	}

	public void setStorePhoneNumber(String storePhoneNumber) {
		this.storePhoneNumber = storePhoneNumber;
	}
	

}
