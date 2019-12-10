package org.skni.student_was.domain.repository;

import org.skni.student_was.domain.Student;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StudentRepositoryBasicImpl {
    private Map<String, Student> students = new HashMap<>();

    public StudentRepositoryBasicImpl() { }

    public void addStudent (String name, int semester) {
        Student student = new Student(name, semester);
        students.put(name, student);
    }

    public void deleteStudent (String name) {
        students.remove(name);
    }

    public Student getStudent (String name) {
        return students.get(name);
    }

    public Collection<Student> getAllStudent() {
        return students.values();
    }

    @PostConstruct
    public void build () {
        addStudent("Tomek", 2);
        addStudent("Masza", 4);
    }

//    @PreDestroy
//    public void tearDown () {
//        System.out.println("Liczba studentów: " + students.size());
//    }

    @Override
    public String toString() {
        return "StudentRepository{" +
                "students=" + students.values() +
                '}';
    }
}
