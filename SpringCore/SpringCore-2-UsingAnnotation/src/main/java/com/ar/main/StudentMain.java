package com.ar.main;

import com.ar.config.StudentConfig;
import com.ar.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
        Student student = (Student) context.getBean("stdObj1");
        student.display();
        System.out.println();
        Student stdObj2 = (Student) context.getBean("stdObj2");
        stdObj2.display();
    }
}
