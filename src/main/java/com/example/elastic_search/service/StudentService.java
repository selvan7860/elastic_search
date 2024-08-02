package com.example.elastic_search.service;


import com.example.elastic_search.dao.Student;
import com.example.elastic_search.dto.StudentDTO;
import com.example.elastic_search.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentDTO addStudent(StudentDTO studentDTO){
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setEmail(studentDTO.getEmail());
        student.setCourse(studentDTO.getCourse());
        Student students = studentRepository.save(student);
        return convertDTO(students);
    }

    private StudentDTO convertDTO(Student students) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(students.getId());
        studentDTO.setName(students.getName());
        studentDTO.setEmail(students.getEmail());
        studentDTO.setCourse(students.getCourse());
        return studentDTO;
    }
}
