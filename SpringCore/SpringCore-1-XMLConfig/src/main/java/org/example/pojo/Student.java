package org.example.pojo;

public class Student {
    private int id;
    private String name;
    private String address;

    //getter & setters
    public Student() {}
    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void display() {
        System.out.println("Id :"+ id);
        System.out.println("name :"+ name);
        System.out.println("addreess :"+ address);
    }
}
