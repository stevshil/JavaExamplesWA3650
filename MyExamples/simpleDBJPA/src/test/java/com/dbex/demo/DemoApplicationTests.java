// https://howtodoinjava.com/spring-boot2/testing/rest-controller-unit-test-example/
// https://medium.com/@mbanaee61/api-testing-in-spring-boot-2a6d69e5c3ce

package com.dbex.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;

import java.io.IOException;

import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
    private MockMvc mockMvc;

	@Test
	public void testTutorialsIdOK() {
		long tutorialId = 1;

		try {
			ResultActions result = mockMvc.perform(get("/api/tutorials/{id}", tutorialId));
			result.andExpect(status().isOk());
		} catch (Exception e) {
			assertFalse(null);
		}

	}

	@Test
	public void testTutorialsIdOKTitleSpringTutorial() {
		long tutorialId = 1;

		try {
			ResultActions result = mockMvc.perform(get("/api/tutorials/{id}", tutorialId));
			result.andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.title").value("Spring Tutorial 1"));
		} catch (Exception e) {
			assertFalse(null);
		}

	}

	// Failing test
	/*
	@Test
	public void testTutorialsIdOKTitleSpringTutorial() {
		long tutorialId = 1;

		try {
			ResultActions result = mockMvc.perform(get("/api/tutorials/{id}", tutorialId));
			result.andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.title").value("Spring Tutorial"));
		} catch (Exception e) {
			assertFalse(null);
		}

	}
	*/
}
