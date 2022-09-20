package com.proyecto.estudiantes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/")
    public String principal() {
        return "create_student";
    }

    @RequestMapping("/students")
    public String estudiantes() {
        return "students";
    }

    @RequestMapping("/editar")
    public String editar() {
        return "edit_student";
    }

}
