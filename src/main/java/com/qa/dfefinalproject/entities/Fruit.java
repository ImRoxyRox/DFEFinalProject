package com.qa.dfefinalproject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fruit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String kiwi;
	
	@Column(nullable = false)
	private String mango;
	
	@Column(nullable = false)
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
