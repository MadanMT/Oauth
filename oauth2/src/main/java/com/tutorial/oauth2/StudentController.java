package com.tutorial.oauth2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepo;

    @GetMapping("/students")
    public List<Student> listAll(Model model) {
        List<Student> listStudents = studentRepo.findAll();
       listStudents.forEach(s-> System.out.println(s));
        model.addAttribute("listStudents", listStudents);

        return listStudents;
    }

}