package org.skni.student_was.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Exam {

    @Autowired
    List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Osoby podchodządzące do egzaminu: " + Arrays.toString(studentList.toArray());
    }

    //    @Autowired
//    @Qualifier(value = "agata")
//    Student student;

//    public void takeFinalExam() {
//        student.setSemester(student.getSemester() + 1);
//    }

//    public void setStudent(Student student) {
//        this.student = student;
//    }

//    @Override
//    public String toString() {
//
//        return "Egzamin na koniec semestru pisze: " + student;
//    }

    public Exam() {

    }
}