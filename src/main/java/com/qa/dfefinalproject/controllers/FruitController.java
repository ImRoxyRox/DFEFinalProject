package com.qa.dfefinalproject.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.dfefinalproject.entities.Fruit;

@RequestMapping("/fruit")
@RestController
public class FruitController {

	private List<Fruit> fruits = new ArrayList<>();

	@PostMapping("/create")
	public Fruit create(@RequestBody Fruit fruit) {
		this.fruits.add(fruit);

		return this.fruits.get(this.fruits.size() - 1);
	}

	@GetMapping("/readAll")
	public List<Fruit> readAll() {
		return this.fruits;

	}

	@GetMapping("/readById/{id}")
	public Fruit readById(@PathVariable int id) {
		return this.fruits.get(id);
	}

	@PutMapping("/update/{id}")
	public Fruit update(@PathVariable int id, @RequestBody Fruit fruit) {
		this.fruits.remove(id);
		this.fruits.add(id, fruit);
		return this.fruits.get(id);
	}

}