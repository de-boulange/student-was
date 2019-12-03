package org.skni.student_was;

import org.skni.student_was.domain.Exam;
import org.skni.student_was.domain.Student;
import org.skni.student_was.domain.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    @Autowired
    University university;

    @Autowired
    Student student;

    @Autowired
    Exam exam;

    @Override
    public void run(String... args) throws Exception {
//        System.out.println(university.getStudent());
//        exam.takeFinalExam();
//        System.out.println(university.getStudent());

        System.out.println(exam);
    }
}
