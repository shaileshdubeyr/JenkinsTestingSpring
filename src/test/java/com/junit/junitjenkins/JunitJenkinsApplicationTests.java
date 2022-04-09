package com.junit.junitjenkins;

import com.junit.junitjenkins.mathemitical.Calculation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JunitJenkinsApplicationTests {

	@Test
	void contextLoads() {

	}

	@Test
	public void getBoolyanValueAndTestTureOrFalse(){
		Calculation cal = new Calculation ();
		Boolean status = cal.getValue(23, 45);
		Assertions.assertEquals(true,status);
	}

}
