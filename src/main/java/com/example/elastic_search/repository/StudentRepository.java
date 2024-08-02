package com.example.elastic_search.repository;

import com.example.elastic_search.dao.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
}
