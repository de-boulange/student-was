package org.skni.student_was.domain.repositories;

import org.skni.student_was.domain.Task;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class TaskRepository {

    Random rand = new Random();

    List<Task> taskList = new ArrayList<>();

    public void createTask(String description) {
        taskList.add(new Task(description));
    }

    public List<Task> getAll() {
        return taskList;
    }

    public void deleteTask(Task task) {
        taskList.remove(task);
    }

    @PostConstruct
    public void init() {

    }

    @Override
    public String toString() {
        return "TaskRepository[" +
                "taskList=" + taskList +
                ']';
    }

    @Scheduled(fixedDelayString  = "${task.creation.delay}")
    public void createRandomTask() {
        List<String> taskDescriptionsList = new ArrayList<>();

        taskDescriptionsList.add("Zadanie z algebry liniowej");
        taskDescriptionsList.add("Napisanie eseju nt. szkolnictwa w Polsce");
        taskDescriptionsList.add("Napisanie programu w Java Spring");
        taskDescriptionsList.add("Zadanie z mikroekonomii");

        String description = taskDescriptionsList.get(rand.nextInt(taskDescriptionsList.size()));
        System.out.println("Utworzylem zdanie o opisie " + description);
        createTask(description);
    }
}
