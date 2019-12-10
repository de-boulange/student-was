package org.skni.student_was;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
//@ComponentScan(basePackages = "org.skni")
//@ImportResource("config/spring-beans.xml")
public class StudentWasApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentWasApplication.class, args);
	}

}
