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

    @Bean(name="tomek")
    @Primary
    public Student tomek() {
        Student tomek = new Student(task);
        tomek.setName("Tomek");
        tomek.setSemester(3);
        return tomek;
    }

    @Bean(name="agata")
    public Student agata() {
        Student agata = new Student(task);
        agata.setName("Agata");
        agata.setSemester(1);
        return agata;
    }

}
