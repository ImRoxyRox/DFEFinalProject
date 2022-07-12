package com.qa.dfefinalproject.entities;

import javax.persistence.Entity;

@Entity
public class Fruit {
	
	private long id;
	private String kiwi;
	private String mango;
	private String pineapple;
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getKiwi() {
		return kiwi;
	}
	public void setKiwi(String kiwi) {
		this.kiwi = kiwi;
	}
	public String getMango() {
		return mango;
	}
	public void setMango(String mango) {
		this.mango = mango;
	}
	public String getPineapple() {
		return pineapple;
	}
	public void setPineapple(String pineapple) {
		this.pineapple = pineapple;
	}

}
