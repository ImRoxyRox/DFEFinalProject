package com.qa.dfefinalproject.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.dfefinalproject.entities.Fruit;
import com.qa.dfefinalproject.repos.FruitRepo;

@Service
public class FruitService {

	private FruitRepo repo;

	public FruitService(FruitRepo repo) {
		this.repo = repo;
	}

	public Fruit create(Fruit fruit) {
		return this.repo.saveAndFlush(fruit);
	}

	public List<Fruit> readAll() {
		return this.repo.findAll();
	}

	public Fruit readById(long id) {
		return this.repo.findById(id).get();
	}

	public Fruit update(long id, Fruit fruit) {

		Fruit existing = this.repo.findById(id).get();
		existing.setKiwi(fruit.getKiwi());
		existing.setMango(fruit.getMango());
		existing.setPineapple(fruit.getPineapple());

		return this.repo.saveAndFlush(existing);
	}

	public boolean delete(long id) {
		this.repo.deleteById(id);

		return !this.repo.existsById(id);
	}

}