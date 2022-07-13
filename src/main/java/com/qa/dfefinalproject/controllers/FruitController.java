package com.qa.dfefinalproject.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
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

}