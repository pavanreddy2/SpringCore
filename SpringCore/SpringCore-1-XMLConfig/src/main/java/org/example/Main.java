package org.example;

import org.example.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        String cfg = "cfg.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(cfg);
        Student student = (Student) applicationContext.getBean("stdId");
        student.display();
        System.out.println();
        Student student1 = (Student) applicationContext.getBean("stdId2");
        student1.display();
    }
}