package org.skni.student_was;

import org.skni.student_was.domain.repositories.StudentRepository;
import org.skni.student_was.domain.repositories.TaskRepository;
import org.skni.student_was.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    TaskRepository taskRepository;

    @Autowired
    TaskService taskService;

    @Override
    public void run(String... args) throws Exception {
        taskRepository.createRandomTask();
        taskRepository.createRandomTask();
    }
}
