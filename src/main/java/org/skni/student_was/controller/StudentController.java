package org.skni.student_was.controller;

import org.skni.student_was.domain.Student;
import org.skni.student_was.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/students")
    public String getStudents(Model model) {
        List<Student> allStudents = service.getAllStudents();
        model.addAttribute("students", allStudents);
        return "students.html";
    }

    @GetMapping("/student")
    public String getStudent(@RequestParam("id") int id, Model model) {
        Student student = service.getStudent(id);
        model.addAttribute("student", student);
        return "student.html";
    }

    @RequestMapping("/newstudent")
    public String createStudent(Model model) {
        model.addAttribute("student", new Student());
        return "studentform.html";
    }

    @PostMapping(value = "/students")
    public String saveStudent(@Valid Student student, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            System.out.println("There were errors");
            for (ObjectError error : bindingResult.getAllErrors())
            {
                System.out.println(error.toString());
            }
            return "studentform.html";
        } else {
            service.saveStudent(student);
            return "redirect:/students";
        }
    }

    @RequestMapping(value = "/student/delete/{id}")
    public String deleteStudent(@PathVariable("id") int id) {
        service.deleteStudent(id);
        return "redirect:/students";
    }
}
