package org.skni.student_was.domain.repository;

import org.skni.student_was.domain.Student;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.nio.channels.NotYetConnectedException;
import java.util.Collection;

@Repository
@Profile("prod")
public class StudentRepositoryDBImpl implements StudentRepository {

    @Override
    public void addStudent(String name, int semester) {
        throw new NotYetConnectedException();
    }

    @Override
    public void deleteStudent(String name) {
        throw new NotYetConnectedException();
    }

    @Override
    public Student getStudent(String name) {
        throw new NotYetConnectedException();
    }

    @Override
    public Collection<Student> getAllStudent() {
        throw new NotYetConnectedException();
    }

    @Override
    public void build() {
        throw new NotYetConnectedException();
    }
}
