package org.skni.student_was.domain.repository;

import org.skni.student_was.domain.Student;
import org.skni.student_was.utils.IdGenerator;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Profile("dev")
public class StudentRepositoryBasicImpl implements StudentRepository {

    private Map<Integer, Student> students = new HashMap<>();

    public StudentRepositoryBasicImpl() { }

    @Override
    public void addStudent (Student student) {
        Integer id = IdGenerator.getUniqueId();
        student.setId(id);
        students.put(id, student);
    }

    @Override
    public void deleteStudent (Integer id) {
        students.remove(id);
    }

    @Override
    public Student getStudent (Integer id) {
        return students.get(id);
    }

    @Override
    public Collection<Student> getAllStudent() {
        return students.values();
    }

    @PostConstruct
    public void build () {
        Student tomek = new Student("Tomek", 2);
        Student masza = new Student("Masza", 4);
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
