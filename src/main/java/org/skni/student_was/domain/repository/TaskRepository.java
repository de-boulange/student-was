package org.skni.student_was.domain.repository;

import org.skni.student_was.domain.Task;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class TaskRepository {

    private List<Task> tasks = new ArrayList<>();

    public void addTask (String description) {
        Task task = new Task(description);
        this.tasks.add(task);
    }

    public void removeTask(int id) {
        tasks.remove(id);
    }

    public List<Task> getAllTasks () {
        return tasks;
    }

    //@Scheduled(fixedDelayString = "${random.task.delay}")
    // @Scheduled(fixedDelay = 5000)
    public void createRandomTask() {
        List<String> descriptionList = new ArrayList<>();
        descriptionList.add("Zadanie z algebry liniowej");
        descriptionList.add("Napisanie programu w Java Spring");
        descriptionList.add("Napisanie eseju nt. Javy");
        descriptionList.add("Zadanie z mikroekonomii");

        for (String desc : descriptionList) {
            addTask(desc);
        }
    }

    @Override
    public String toString() {
        return "TaskRepository{" +
                "tasks=" + tasks +
                '}';
    }
}
