package org.skni.student_was;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.UUID;

@SpringBootApplication
@EnableScheduling
public class StudentWasApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentWasApplication.class, args);
	}

}
