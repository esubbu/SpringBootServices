package com.angular.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table public class Movie {
	
	@Id
	private long id;
	 String name;
	 String language;
	 String type;
	 double rate;
	 String imageUrl;
	 
	
	/*public Movie(long id, String name, String language, String type, int rate, String imageUrl) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.type = type;
		this.rate = rate;
		this.imageUrl = imageUrl;
	}*/
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	} 
	
}
