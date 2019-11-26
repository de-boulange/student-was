package org.skni.student_was;

import org.skni.student_was.domain.Student;
import org.skni.student_was.domain.Task;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentWasApplication {

	public static void main(String[] args) {

		SpringApplication.run(StudentWasApplication.class, args);
		Task doHomeTask = new Task ("Zadanie domowe nr 3");
		Student tomek = new Student("Tomek", 3, doHomeTask);
		System.out.println(tomek);


		Task writeEssey = new Task ("Esej na temat Java");
		Student ania = new Student ("Ania", 1, writeEssey);
		System.out.println(ania);
	}

}
