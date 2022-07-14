package com.qa.dfefinalproject.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.dfefinalproject.entities.Fruit;

@SpringBootTest
@AutoConfigureMockMvc
@Sql(scripts = { "classpath:testschema.sql",
		"classpath:testdata.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
@ActiveProfiles("test")
public class FruitControllerTest {

	@Autowired
	private MockMvc mvc;

	@Autowired
	private ObjectMapper mapper;

	@Test
	public void createTest() throws Exception {
		Fruit entry = new Fruit("Hardy", "Francis", "Queen");
		String entryAsJSON = mapper.writeValueAsString(entry);

		Fruit result = new Fruit(2L, "Hardy", "Francis", "Queen");
		String resultAsJSON = mapper.writeValueAsString(result);

		mvc.perform(post("/fruit/create").contentType(MediaType.APPLICATION_JSON).content(entryAsJSON))
				.andExpect(content().json(resultAsJSON));
	}

	@Test
	public void readAllTest() throws Exception {

		List<Fruit> output = new ArrayList<>();
		Fruit entry = new Fruit(1L, "Actinidia", "Ataulfo", "Abacaxi");
		output.add(entry);

		String outputAsJSON = mapper.writeValueAsString(output);

		mvc.perform(get("/fruit/readAll").contentType(MediaType.APPLICATION_JSON))
				.andExpect(content().json(outputAsJSON));
	}

	@Test
	public void readByIdTest() throws Exception {
		Fruit entry = new Fruit(1L, "Actinidia", "Ataulfo", "Abacaxi");
		String entryAsJSON = this.mapper.writeValueAsString(entry);

		mvc.perform(get("/fruit/readById/1").contentType(MediaType.APPLICATION_JSON))
				.andExpect(content().json(entryAsJSON));
	}

	@Test
	public void updateTest() throws Exception {
		Fruit entry = new Fruit("Hardy", "Francis", "Queen");
		Fruit result = new Fruit(1L, "Hardy", "Francis", "Queen");
		String entryAsJSON = this.mapper.writeValueAsString(entry);
		String resultAsJSON = this.mapper.writeValueAsString(result);

		mvc.perform(put("/fruit/update/1").contentType(MediaType.APPLICATION_JSON).content(entryAsJSON))
				.andExpect(content().json(resultAsJSON));
	}

	@Test
	public void deleteTest() throws Exception {
		mvc.perform(delete("/fruit/delete/1").contentType(MediaType.APPLICATION_JSON))
				.andExpect(content().string("true"));
	}
}