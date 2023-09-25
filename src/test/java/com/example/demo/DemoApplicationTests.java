package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class DemoApplicationTests {


	@Test
	void contextLoads() {
	}

	@Test
	public void testSize() {
		System.out.println("test cases running");
		List<String> obj = new ArrayList<>();
		obj.add("Emma");
		obj.add("Ronan");
		obj.add("Antonio");
		assertEquals("Checking size of List", 3, obj.size());
	}



}
