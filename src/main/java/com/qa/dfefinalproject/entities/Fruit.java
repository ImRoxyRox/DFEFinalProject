package com.qa.dfefinalproject.entities;

import java.util.Objects;

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

	public Fruit() {
	}

	public Fruit(String kiwi, String mango, String pineapple) {
		super();
		this.kiwi = kiwi;
		this.mango = mango;
		this.pineapple = pineapple;
	}

	public Fruit(long id, String kiwi, String mango, String pineapple) {
		super();
		this.id = id;
		this.kiwi = kiwi;
		this.mango = mango;
		this.pineapple = pineapple;
	}

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

	@Override
	public int hashCode() {
		return Objects.hash(id, kiwi, mango, pineapple);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return id == other.id && Objects.equals(kiwi, other.kiwi) && Objects.equals(mango, other.mango)
				&& Objects.equals(pineapple, other.pineapple);
	}

}
