package org.skni.student_was;

import org.junit.jupiter.api.Test;
import org.skni.student_was.domain.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StudentWasApplicationTests {

	@Autowired
	University university;

	@Test
	void contextLoads() {
	}

	@Test
	public void universityTest () {
		String expectedValue = "University[name=PW,studentName=Tomek]";
		assertEquals(expectedValue, university.toString());
	}

}
