package com.klef.jfsd.Labexam;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Device {
	@Id
	public int id;
	public String brand;
	public String model;
	public double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
