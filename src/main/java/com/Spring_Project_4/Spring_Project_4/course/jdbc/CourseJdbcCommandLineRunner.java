package com.Spring_Project_4.Spring_Project_4.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;


    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Python", "Mevin Perera"));
        repository.insert(new Course(2, "Jave", "Mevin Perera"));
        repository.insert(new Course(3, "Stack", "Mevin Perera"));
        System.out.println("Insert operation completed.");

        repository.deleteById(2);
        System.out.println("Course with ID 2 deleted.");
    }
}
