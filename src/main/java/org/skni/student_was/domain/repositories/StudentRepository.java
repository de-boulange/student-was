package org.skni.student_was.domain.repositories;

import org.skni.student_was.domain.Student;
import java.util.Collection;

public interface StudentRepository {

    void createStudent(String name, int semester);

    Collection<Student> getAllStudents();

    Student getStudentByName (String name);

    void deleteStudent(String name);

    void build ();

}
