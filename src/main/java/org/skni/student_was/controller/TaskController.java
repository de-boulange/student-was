package org.skni.student_was.controller;

import org.skni.student_was.domain.Student;
import org.skni.student_was.service.StudentService;
import org.skni.student_was.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TaskController {

    @Autowired
    StudentService studentService;

    @Autowired
    TaskService taskService;

    @RequestMapping("/assignTask")
    public String assignQuest(@RequestParam("studentId") int id, Model model) {
        Student student = studentService.getStudent(id);
        taskService.assignTask(id);
        model.addAttribute("student", student);
        return "redirect:/students";
    }
}
