package com.ar.main;

import com.ar.config.SpringConfigFile;
import com.ar.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student student = context.getBean(Student.class);
        student.StudentDetails();
    }
}
