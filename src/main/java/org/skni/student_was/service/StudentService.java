package org.skni.student_was.service;

import org.skni.student_was.domain.Student;
import org.skni.student_was.domain.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public Collection<Student> getAllStudents () { return repository.getAllStudent(); }

    public void saveStudent(Student student) {
        repository.addStudent(student);
    }

    public Student getStudent (Integer id) {
        return repository.getStudent(id);
    }

    public void deleteStudent (Integer id) {
        repository.deleteStudent(id);
    }
}
