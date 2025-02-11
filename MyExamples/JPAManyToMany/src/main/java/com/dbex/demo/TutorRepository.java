package com.dbex.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface TutorRepository extends JpaRepository<Tutor, Long> {
    @Query("SELECT t FROM Tutor t JOIN FETCH t.tutorial")
    List<Tutor> findAllTutorsWithTutorials();
}