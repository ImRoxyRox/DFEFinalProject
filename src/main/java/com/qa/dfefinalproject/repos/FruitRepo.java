package com.qa.dfefinalproject.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.dfefinalproject.entities.Fruit;

@Repository
public interface FruitRepo extends JpaRepository<Fruit, Long> {

}
