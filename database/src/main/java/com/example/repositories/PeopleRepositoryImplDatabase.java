package com.example.repositories;

import com.example.models.Person;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PeopleRepositoryImplDatabase {
    private final PeopleRepository peopleRepository;

    public PeopleRepositoryImplDatabase(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public List<Person> getAllPeople() {
        return peopleRepository.findAll();
    }
}
