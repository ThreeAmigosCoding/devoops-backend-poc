package com.devoops.backend_poc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BackendPocApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void failingTest() {
		throw new RuntimeException("This test is failing");
	}

}
