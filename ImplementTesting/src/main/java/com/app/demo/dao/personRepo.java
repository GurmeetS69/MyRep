package com.app.demo.dao;

import com.app.demo.entity.person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface personRepo extends JpaRepository<person, Integer> {
    @Query("SELECT CASE WHEN COUNT(s) > 0 THEN TRUE ELSE FALSE END FROM person s WHERE s.personId = ?1")
    Boolean isPersonExitsById(Integer id);

}
