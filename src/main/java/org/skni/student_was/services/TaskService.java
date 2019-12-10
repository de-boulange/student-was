package org.skni.student_was.services;

import org.skni.student_was.domain.Student;
import org.skni.student_was.domain.Task;
import org.skni.student_was.domain.repositories.InMemoryStudentRepository;
import org.skni.student_was.domain.repositories.StudentRepository;
import org.skni.student_was.domain.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class TaskService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    TaskRepository taskRepository;

    final static Random rand = new Random();

    public void assignRandomQuest(String studentName) {
        List<Task> allQuests = taskRepository.getAll();
        Task randomTask = allQuests.get(rand.nextInt(allQuests.size()));

        Student student = studentRepository.getStudentByName(studentName);
        if (student != null) {
            student.setTask(randomTask);
        }
        taskRepository.deleteTask(randomTask);
    }
}