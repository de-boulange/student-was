package org.skni.student_was;

import org.skni.student_was.domain.Student;
import org.skni.student_was.domain.Task;
import org.skni.student_was.domain.University;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.GenericXmlApplicationContext;

@SpringBootApplication
//@ImportResource("classpath:config/spring-beans.xml")
public class StudentWasApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentWasApplication.class, args);

		//		University uni = (University) ctx.getBean("uni");
//		System.out.println(uni);
//
//		Starter starter = (Starter)ctx.getBean("starter");
//		System.out.println(starter);

//		Task doHomeTask = new Task ("Zadanie domowe nr 3");
//		Student tomek = new Student("Tomek", 3, doHomeTask);
//		System.out.println(tomek);
//
//
//		Task writeEssey = new Task ("Esej na temat Java");
//		Student ania = new Student ("Ania", 1, writeEssey);
//		System.out.println(ania);
	}

}
