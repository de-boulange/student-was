package org.skni.student_was.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("uni")
public class University {

    @Value("${university.name:WAT}")
    private String name;

    private Student student;

    @Autowired
    public University (Student student) {
        this.student = student;
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

    @Override
    public String toString() {
        return "University[" +
                "name=" + this.name +
                ",studenName=" + this.student.getName() +
                "]";
    }
}
