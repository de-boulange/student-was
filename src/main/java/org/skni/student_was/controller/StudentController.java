package org.skni.student_was.controller;

import jdk.jfr.ContentType;
import org.skni.student_was.domain.Student;
import org.skni.student_was.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/students")
    public String getStudents (Model model) {
        Collection<Student> students = service.getAllStudents();
        model.addAttribute("students", students);
        return "students.html";
    }

    @GetMapping("/newstudent")
    public String createStudent (Model model) {
        model.addAttribute("student", new Student());
        return "studentform.html";
    }

    @PostMapping("/students")
    public String saveStudent (Student student) {
        service.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/student")
    public String getStudent (@RequestParam("id") Integer id, Model model) {
        Student student = service.getStudent(id);
        model.addAttribute("student", student);
        return "student.html";
    }

    @GetMapping("/student/delete/{id}")
    public String deleteStudent (@PathVariable("id") Integer id) {
        service.deleteStudent(id);
        return "redirect:/students";
    }
}
