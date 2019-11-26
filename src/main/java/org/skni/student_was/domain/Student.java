package org.skni.student_was.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:student.properties")
public class Student{

    @Value("${student.name:Dzban}")
    private String name;

    @Value("${student.semester:1}")
    private int semester;

    private Task task;

    @Autowired
    public Student (Task task) {
        this.task=task;
    }

    public void setTask(String name) {
        this.name = name;
    }

    public int getYear() {
        return semester;
    }

    public void setYear(int year) {
        this.semester = year;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student " + name + " jest na " + semester + " roku studiów. ta osoba ma takie zaległości: " + task;
    }
}
