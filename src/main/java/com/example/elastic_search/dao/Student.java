package com.example.elastic_search.dao;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "students")
@Data
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;
    private String name;
    private String email;
    private String course;
}
