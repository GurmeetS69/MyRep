package com.app.demo.repo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.demo.dao.personRepo;
import com.app.demo.entity.person;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonRepoTest {


    @Autowired
    private personRepo PersonRepo;

    @Test
    void isPersonExitsById() {
        person person = new person(69, "Gurmeet", "Delhi");
        PersonRepo.save(person);
        Boolean actualResult = PersonRepo.isPersonExitsById(69);
        assertThat(actualResult).isTrue();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tearing down");
        PersonRepo.deleteAll();
    }

    @BeforeEach
    void setUp() {
        System.out.println("Setting up");
    }
}
