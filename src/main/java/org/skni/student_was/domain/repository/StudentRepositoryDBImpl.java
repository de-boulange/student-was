package org.skni.student_was.domain.repository;

import org.skni.student_was.domain.Student;
import org.skni.student_was.domain.Task;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.OneToOne;
import javax.persistence.PersistenceContext;
import java.nio.channels.NotYetConnectedException;
import java.util.Collection;

@Repository
@Profile("prod")
public class StudentRepositoryDBImpl implements StudentRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void addStudent(String name, int semester) {
        Student student = new Student(name, semester);

        em.persist(student);
    }

    @Override
    @Transactional
    public void addStudent(Student student) {
        em.persist(student);
    }

    @Override
    @Transactional
    public void deleteStudent(int id) {
        em.remove(id);
    }

    @Override
    @Transactional
    public void updateStudent(int id, Student student) {
        em.merge(student);
    }

    @Override
    public Student getStudent(int id) {
        return em.find(Student.class, id);
    }

    @Override
    public Collection<Student> getAllStudent() {
        return  em.createQuery("from Student", Student.class).getResultList();
    }

    @Override
    public void build() {

    }
}
