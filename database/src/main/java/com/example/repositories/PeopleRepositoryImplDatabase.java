package com.example.repositories;

import com.example.models.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PeopleRepositoryImplDatabase {
    private final PeopleRepository peopleRepository;

    public List<Person> getAllPeople() {
        return peopleRepository.findAll();
    }
}
