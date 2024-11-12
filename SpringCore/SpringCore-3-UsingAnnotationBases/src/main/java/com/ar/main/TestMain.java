package com.ar.main;

import com.ar.config.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {

        //ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student student = (Student) context.getBean("student");
        student.display();
    }
}
