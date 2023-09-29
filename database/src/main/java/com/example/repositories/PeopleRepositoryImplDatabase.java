package com.example.repositories;

import com.example.models.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class PeopleRepositoryImplDatabase {
    private final PeopleRepository peopleRepository;

    public List<Person> getAllPeople() {
        return peopleRepository.findAll();
    }


    public Optional<Person> getPersonById(Integer id) {
        return peopleRepository.findById(id);
    }
}
