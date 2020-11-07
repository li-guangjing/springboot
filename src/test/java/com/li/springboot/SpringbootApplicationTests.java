package com.li.springboot;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

    @BeforeEach
    void before(){
        System.out.println("this is before test message");
    }
	@Test
	void contextLoads() {
		System.out.println("this is test message");
	}

	@AfterEach
    void after(){
        System.out.println("this is after test message");
    }

}
