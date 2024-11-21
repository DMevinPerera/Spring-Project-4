package com.Spring_Project_4.Spring_Project_4.course.jdbc;

import com.Spring_Project_4.Spring_Project_4.course.jdbc.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class CourseCommandLineRunner implements CommandLineRunner {

 //   @Autowired
 //   private CourseJdbcRepository repository;

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Python JPA", "Mevin Perera"));
        repository.insert(new Course(2, "Jave", "Mevin Perera"));
        repository.insert(new Course(3, "Stack", "Mevin Perera"));
        repository.insert(new Course(4, "C+", "Mevin Perera"));
        System.out.println("Insert operation completed.");

        repository.deleteById(2);
        System.out.println("Course with ID 2 deleted.");

        System.out.println(repository.findById(3));
        System.out.println(repository.findById(4));
    }

}
