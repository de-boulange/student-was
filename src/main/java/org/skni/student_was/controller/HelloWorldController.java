package org.skni.student_was.controller;

import org.skni.student_was.domain.repository.StudentRepositoryBasicImpl;
import org.skni.student_was.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @Autowired
    TaskService service;

    @RequestMapping("/hello")
    public String helloWorld() {

        return "helloworld.html";
    }
}
