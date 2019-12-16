package org.skni.student_was.domain.repository;

import org.skni.student_was.domain.Student;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Profile("dev")
public class StudentRepositoryBasicImpl implements StudentRepository {
    private Map<String, Student> students = new HashMap<>();

    public StudentRepositoryBasicImpl() { }

    @Override
    public void addStudent (String name, int semester) {
        Student student = new Student(name, semester);
        students.put(name, student);
    }

    @Override
    public void deleteStudent (String name) {
        students.remove(name);
    }

    @Override
    public Student getStudent (String name) {
        return students.get(name);
    }

    @Override
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
