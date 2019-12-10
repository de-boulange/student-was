package org.skni.student_was;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages = "org.skni")
//@ImportResource("config/spring-beans.xml")
public class StudentWasApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentWasApplication.class, args);
	}

}
