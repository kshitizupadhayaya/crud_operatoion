package com.jpa.test.cruddb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String city;
    private String  name;
    private String status;

    public Student() {
    }

    public Student(int id, String city, String name, String status) {
        this.id = id;
        this.city = city;
        this.name = name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

