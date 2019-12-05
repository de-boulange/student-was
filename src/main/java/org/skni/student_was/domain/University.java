package org.skni.student_was.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("uni")
@Primary
public class University {

    @Value("${university.name:WAT}")
    private String name;

    private Student student;

    @Autowired
    public University (Student student) {
        this.student = student;
    }

    University (Student student, String name) {
        this.student = student;
        this.name = name;
    }

    @PostConstruct
    public void build () {
        System.out.println("Bean University " + name + " has bean created");
    }

    @PreDestroy
    public void tearDown () {
        System.out.println("Bean University " + name + " is being destroyed");
    }

    public String getName() {
        return name;
    }

    public Student getStudent() {
        return student;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "University[" +
                "name=" + this.name +
                ",studentName=" + this.student.getName() +
                "]";
    }
}
