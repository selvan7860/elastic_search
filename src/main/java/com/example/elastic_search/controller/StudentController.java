package com.example.elastic_search.controller;

import com.example.elastic_search.dto.GenericResponse;
import com.example.elastic_search.dto.StudentDTO;
import com.example.elastic_search.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public GenericResponse addStudent(@RequestBody StudentDTO studentDTO){
        return new GenericResponse(studentService.addStudent(studentDTO));
    }
}
