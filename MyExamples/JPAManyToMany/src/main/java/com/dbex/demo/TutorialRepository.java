package com.dbex.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
  List<Tutorial> findByPublished(boolean published);

  List<Tutorial> findByTitleContaining(String title);

  @Query("SELECT t FROM Tutorial t JOIN t.takes s WHERE s.firstname = :firstname")
  List<Tutorial> findTutorialsByStudentFirstname(@Param("firstname") String firstname);
}