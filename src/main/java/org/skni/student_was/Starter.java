package org.skni.student_was;

import org.skni.student_was.domain.repository.StudentRepository;
import org.skni.student_was.domain.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    TaskRepository taskRepository;

    @Override
    public void run(String... args) throws Exception {
    }
}
