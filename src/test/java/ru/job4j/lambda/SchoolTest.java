package ru.job4j.lambda;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SchoolTest {
    List<Student> students;

    @Before
    public void initialize() {
        students = List.of(
                new Student("Petrov", 10),
                new Student("Sidoroov", 20),
                new Student("Ivanov", 30),
                new Student("Chizov", 50),
                new Student("Chizikov", 96),
                new Student("Kozlov", 60),
                new Student("Bobrov", 80)
                );
    }

    @Test
    public void whenFilterToClassA() {
        List<Student> result = School.collect(students, (s) -> s.getScore() >= 70);
        result.stream().map(s -> s.getSurname()).forEach(System.out::println);
        assertThat(result, containsInAnyOrder(
                new Student("Bobrov", 80),
                new Student("Chizikov", 96)
        ));
    }

    @Test
    public void whenFilterToClassB() {
        List<Student> result = School.collect(students, (s) -> s.getScore() >= 50 && s.getScore() < 70);
        result.stream().map(s -> s.getSurname()).forEach(System.out::println);
        assertThat(result, containsInAnyOrder(
                new Student("Kozlov", 60),
                new Student("Chizov", 50)
        ));
    }

    @Test
    public void whenFilterToClassC() {
        List<Student> result = School.collect(students, (s) -> s.getScore() < 50 );
        result.stream().map(s -> s.getSurname()).forEach(System.out::println);
        assertThat(result, containsInAnyOrder(
                new Student("Petrov", 10),
                new Student("Sidoroov", 20),
                new Student("Ivanov", 30)
        ));
    }

}