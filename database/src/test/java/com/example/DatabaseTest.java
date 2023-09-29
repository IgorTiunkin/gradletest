package com.example;

import com.example.models.Person;
import com.example.repositories.PeopleRepositoryImplDatabase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class DatabaseTest {

    private final PeopleRepositoryImplDatabase peopleRepositoryImplDatabase;

    @Autowired
    public DatabaseTest(PeopleRepositoryImplDatabase peopleRepositoryImplDatabase) {
        this.peopleRepositoryImplDatabase = peopleRepositoryImplDatabase;
    }

    @Test
    public void context() {
    }

    @Test
    public void whenMinusId_thenEmpty() {
        Optional<Person> personById = peopleRepositoryImplDatabase.getPersonById(-1);
        Assertions.assertTrue(personById.isEmpty());
    }


}
