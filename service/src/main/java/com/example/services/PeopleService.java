package com.example.services;

import com.example.models.Person;
import com.example.repositories.PeopleRepositoryImplDatabase;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleService {

    private final PeopleRepositoryImplDatabase peopleRepositoryImpl;

    public PeopleService(PeopleRepositoryImplDatabase peopleRepository) {
        this.peopleRepositoryImpl = peopleRepository;
    }

    public List<Person> getAllPeople () {
        return peopleRepositoryImpl.getAllPeople();
    }
}
