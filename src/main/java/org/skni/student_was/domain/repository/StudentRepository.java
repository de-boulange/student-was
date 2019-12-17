package org.skni.student_was.domain.repository;

import org.skni.student_was.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface StudentRepository {

     void addStudent (String name, int semester);

     void addStudent (Student student);

     void deleteStudent (int id);

     Student getStudent (int id);

     Collection<Student> getAllStudent();

     public void build ();

}
