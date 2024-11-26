package com.jpa.test.cruddb;

import com.jpa.test.cruddb.entities.Student;
import com.jpa.test.cruddb.entities.UserReopsitory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class CruddbApplication {

    public static void main(String[] args) {

       ConfigurableApplicationContext context=SpringApplication.run(CruddbApplication.class, args);
        UserReopsitory userReopsitory=context.getBean(UserReopsitory.class);



        Student user1=new Student();
        user1.setName("ll");
        user1.setCity("lalitpusdd");
        user1.setStatus("i am");

        Student user2=new Student();
        user2.setName("ll");
        user2.setCity("lalitpusdd");
        user2.setStatus("i am");

        Student user3=new Student();
        user3.setName("ll");
        user3.setCity("lalitpusdd");
        user3.setStatus("i am");



        List<Student> users= List.of(user1,user2,user3);
        Iterable<Student> result= userReopsitory.saveAll(users);

        result.forEach(user -> {
            System.out.println(user);
        });
        System.out.println("done");


    }

    }


