package org.skni.student_was.domain.repositories;

import org.skni.student_was.domain.Student;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class InMemoryStudentRepository implements StudentRepository {

    private Map<String, Student> studentMap = new HashMap<>();

    public InMemoryStudentRepository () {

    }

    @Override
    public void createStudent(String name, int semester) {
        studentMap.put(name, new Student(name, semester));
    }

    @Override
    public Collection<Student> getAllStudents() {
        return studentMap.values();
    }

    @Override
    public Student getStudentByName(String name) {
        return studentMap.get(name);
    }

    @Override
    public void deleteStudent(String name) {
        studentMap.remove(name);
    }

    @Override
    @PostConstruct
    public void build() {
        createStudent("Tomek", 2);
        createStudent("Franciszek", 4);
    }
}
