package com.app.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.dao.personRepo;
import com.app.demo.entity.person;

import java.util.List;

@Service
public class personService {
    @Autowired
    private personRepo repo;

    public List<person> getAllPerson() {
        return this.repo.findAll();
    }

    public personService(personRepo repo) {
        this.repo = repo;
    }
}
