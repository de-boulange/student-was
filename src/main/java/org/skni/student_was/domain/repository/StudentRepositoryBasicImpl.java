package org.skni.student_was.domain.repository;

import org.skni.student_was.domain.Student;
import org.skni.student_was.utils.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.rmi.server.UID;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
@Profile("dev")
public class StudentRepositoryBasicImpl implements StudentRepository {

    private Map<Integer, Student> students = new HashMap<>();

    public StudentRepositoryBasicImpl() { }

    @Override
    public void addStudent (String name, int semester) {
        Student student = new Student(name, semester);
        int id = generateId();
        student.setId(id);
        students.put(id, student);
    }

    @Override
    public void addStudent(Student student) {
        int id = generateId();
        student.setId(id);
        students.put(id, student);
    }

    @Override
    public void deleteStudent (int id) {
        students.remove(id);
    }

    @Override
    public Student getStudent (int id) {
        return students.get(id);
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

    private int generateId() {
        return IdGenerator.getUniqueId();
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
