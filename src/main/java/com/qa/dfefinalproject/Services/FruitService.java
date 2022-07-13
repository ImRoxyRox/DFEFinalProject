package com.qa.dfefinalproject.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.dfefinalproject.entities.Fruit;

@Service
public class FruitService {

	private List<Fruit> fruits = new ArrayList<>();

	public Fruit create(Fruit fruit) {
		this.fruits.add(fruit);

		return this.fruits.get(this.fruits.size() - 1);
	}

	public List<Fruit> readAll() {
		return this.fruits;

	}

	public Fruit readById(int id) {
		return this.fruits.get(id);
	}

	public Fruit update(int id, Fruit fruit) {
		this.fruits.remove(id);
		this.fruits.add(id, fruit);
		return this.fruits.get(id);
	}

	public Fruit delete(int id) {
		return this.fruits.remove(id);
	}

}