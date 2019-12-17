package org.skni.student_was.service;

import org.skni.student_was.domain.Student;
import org.skni.student_was.domain.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() { return new ArrayList<>(studentRepository.getAllStudent()); }

    public void saveStudent(Student student) { studentRepository.addStudent(student); }

    public Student getStudent(int id) { return studentRepository.getStudent(id); }

    public void deleteStudent(int id) { studentRepository.deleteStudent(id); }
}
