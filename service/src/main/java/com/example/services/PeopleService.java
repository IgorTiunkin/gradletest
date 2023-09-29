package com.example.services;

import com.example.models.Person;
import com.example.repositories.PeopleRepositoryImplDatabase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PeopleService {

    private final PeopleRepositoryImplDatabase peopleRepositoryImpl;

    public List<Person> getAllPeople () {
        return peopleRepositoryImpl.getAllPeople();
    }
}
