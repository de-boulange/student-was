package org.skni.student_was.domain.repository;

import org.skni.student_was.domain.Task;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class TaskRepository {

//    private List<Task> tasks = new ArrayList<>();
//
//    public void addTask (String description) {
//        Task task = new Task(description);
//        this.tasks.add(task);
//    }
//
//    public void removeTask(int id) {
//        tasks.remove(id);
//    }
//
//    public List<Task> getAllTasks () {
//        return tasks;
//    }

    //@Scheduled(fixedDelayString = "${random.task.delay}")
    // @Scheduled(fixedDelay = 5000)
//    @PostConstruct
//    public void createRandomTask() {
//        List<String> descriptionList = new ArrayList<>();
//        descriptionList.add("Zadanie z algebry liniowej");
//        descriptionList.add("Napisanie programu w Java Spring");
//        descriptionList.add("Napisanie eseju nt. Javy");
//        descriptionList.add("Zadanie z mikroekonomii");
//
//        for (String description : descriptionList) {
//            addTask(description);
//        }
//    }

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void addTask(String description) {
        Task task = new Task(description);
        em.persist(task);
    }

    public List<Task> getAllTasks() {

        return em.createQuery("from Task", Task.class).getResultList();
    }

    @Transactional
    public void removeTask(Task task) {
        em.remove(task);
    }

    @Transactional
    public void update(Task task) {
        em.merge(task);
    }

    public Task getTask(int id) {
        return em.find(Task.class, id);
    }

    @Override
    public String toString() {
        return "TaskRepository{" +
                "tasks=" + getAllTasks() +
                '}';
    }
}
