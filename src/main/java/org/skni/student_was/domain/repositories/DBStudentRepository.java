package org.skni.student_was.domain.repositories;

import org.skni.student_was.domain.Student;
import org.springframework.stereotype.Repository;

import java.nio.channels.NotYetConnectedException;
import java.util.Collection;

public class DBStudentRepository implements StudentRepository {

    @Override
    public void createStudent(String name, int semester) {
        throw new NotYetConnectedException();
    }

    @Override
    public Collection<Student> getAllStudents() {
        throw new NotYetConnectedException();
    }

    @Override
    public Student getStudentByName(String name) {
        throw new NotYetConnectedException();
    }

    @Override
    public void deleteStudent(String name) {
        throw new NotYetConnectedException();
    }

    @Override
    public void build() {
        throw new NotYetConnectedException();
    }
}
