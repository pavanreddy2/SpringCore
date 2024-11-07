package com.ar.config;

import com.ar.pojo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean("stdObj1")
    public Student getStudent1() {
        Student student = new Student();
        student.setId(101);
        student.setName("Pavan Kumar");
        student.setAddress("Kurnool");
        return student;
    }

    @Bean("stdObj2")
    public Student getStudent2() {
        Student student = new Student();
        student.setId(102);
        student.setName("Anurudh Reddy");
        student.setAddress("Kurnool");
        return student;
    }
}
