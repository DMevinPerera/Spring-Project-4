package com.Spring_Project_4.Spring_Project_4.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY =
            """
                    INSERT INTO course (id, name, author)
                    VALUES (?, ?, ?);
            """;

    private static String DELETE_QUERY =
            """
                    DELETE FROM course
                    WHERE id = ?;
            """;

    private static String SELECT_QUERY =
            """
                    SELECT * FROM course
                    WHERE id = ?;
            """;

    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY,
                course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(int id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course findById(long id) {
        return springJdbcTemplate.queryForObject(
                SELECT_QUERY,
                new BeanPropertyRowMapper<>(Course.class),
                id
        );
    }
}
