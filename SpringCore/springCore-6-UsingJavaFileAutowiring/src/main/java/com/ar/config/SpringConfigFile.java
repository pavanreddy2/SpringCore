package com.ar.config;

import com.ar.pojo.Address;
import com.ar.pojo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
    @Bean
    public Address createAddressObj1() {
        Address address = new Address();
        address.setHouseNo(222);
        address.setStreet("Bethamcherla");
        address.setCity("Kurnool");
        return address;
    }

    @Bean
    public Address createAddressObj2() {
        Address address = new Address();
        address.setHouseNo(111);
        address.setStreet("betham");
        address.setCity("Kadapa");
        return address;
    }
    @Bean
    public Student createStudent() {
        Student student = new Student();
        student.setId(101);
        student.setName("Pavan Kumar");
        //student.setAddress(createAddress()); // Manually Doing DI
        return student;
    }
}
