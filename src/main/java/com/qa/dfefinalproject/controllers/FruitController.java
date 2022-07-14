package com.qa.dfefinalproject.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.dfefinalproject.Services.FruitService;
import com.qa.dfefinalproject.entities.Fruit;

@RequestMapping("/fruit")
@RestController
public class FruitController {

	private FruitService service;

	public FruitController(FruitService service) {
		this.service = service;
	}

	@PostMapping("/create")
	public Fruit create(@RequestBody Fruit fruit) {
		return this.service.create(fruit);
	}

	@GetMapping("/readAll")
	public List<Fruit> readAll() {
		return this.service.readAll();
	}

	@GetMapping("/readById/{id}")
	public Fruit readById(@PathVariable long id) {
		return this.service.readById(id);
	}

	@PutMapping("/update/{id}")
	public Fruit update(@PathVariable long id, @RequestBody Fruit fruit) {
		return this.service.update(id, fruit);
	}

	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable long id) {
		return this.service.delete(id);
	}
}