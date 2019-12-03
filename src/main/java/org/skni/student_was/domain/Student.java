package org.skni.student_was.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@PropertySource("classpath:student.properties")
//@Scope("prototype")
public class Student{

    //@Value("${student.name:Dzban}")
    private String name;

    //@Value("${student.semester:1}")
    private int semester;

    private Task task;

    @Autowired
    public Student (Task task) {
        this.task=task;
    }

    Student (Task task, String name, int semester) {
        this.task = task;
        this.name = name;
        this.semester = semester;
    }

    public void setTask(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int year) {
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
        return "Student " + name + " jest na " + semester + " semestrze. Ta osoba ma takie zaległości: " + task;
    }
}
