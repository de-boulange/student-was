package org.skni.student_was.service;

import org.skni.student_was.domain.Student;
import org.skni.student_was.domain.Task;
import org.skni.student_was.domain.repository.StudentRepository;
import org.skni.student_was.domain.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class TaskService {

    @Autowired
    TaskRepository taskRepository;

    @Autowired
    StudentRepository studentRepository;

    final static Random rand = new Random();

    public void assignTask (String name) {
        Student student = studentRepository.getStudent(name);
        List<Task> taskList = taskRepository.getAllTasks();

        if (student != null) {
            student.setTask(taskList.get(rand.nextInt(taskList.size())));
        }
    }
}
