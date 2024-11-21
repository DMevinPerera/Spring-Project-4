package com.Spring_Project_4.Spring_Project_4.course.jdbc;

import com.Spring_Project_4.Spring_Project_4.course.jdbc.jpa.CourseJpaRepository;
import com.Spring_Project_4.Spring_Project_4.course.jdbc.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class CourseCommandLineRunner implements CommandLineRunner {

 //   @Autowired
 //   private CourseJdbcRepository repository;

  //  @Autowired
  //  private CourseJpaRepository repository;


    @Autowired
    private CourseSpringDataJpaRepository repository;


    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Python JPA", "Mevin Perera"));
        repository.save(new Course(2, "Jave", "Mevin Perera"));
        repository.save(new Course(3, "Stack", "Mevin Perera"));
        repository.save(new Course(4, "C+", "Mevin Perera"));
        System.out.println("Insert operation completed.");

        repository.deleteById(2l);
        System.out.println("Course with ID 2 deleted.");

        System.out.println(repository.findById(3l));
        System.out.println(repository.findById(4l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("Mevin Perera"));


    }

}
