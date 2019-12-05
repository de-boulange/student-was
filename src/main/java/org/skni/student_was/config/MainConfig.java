package org.skni.student_was.config;

import org.skni.student_was.domain.Student;
import org.skni.student_was.domain.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MainConfig {

    @Autowired
    Task task;

    @Bean
    public Student student() {
        Student student = new Student (task);
        student.setName("Tomek");
        student.setSemester(3);

        return student;
    }
}
