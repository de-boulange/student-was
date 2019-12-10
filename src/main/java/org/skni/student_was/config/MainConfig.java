package org.skni.student_was.config;

import org.skni.student_was.domain.repositories.DBStudentRepository;
import org.skni.student_was.domain.repositories.InMemoryStudentRepository;
import org.skni.student_was.domain.repositories.StudentRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MainConfig {

    @Bean
    @Profile("dev")
    StudentRepository inMemoryRepository () {
        StudentRepository repository = new InMemoryStudentRepository();
        return repository;
    }

    @Bean
    @Profile("prod")
    StudentRepository dbRepository () {
        StudentRepository repository = new DBStudentRepository();
        return repository;
    }
}
