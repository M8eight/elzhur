package com.elzhur.elzhur.repositories;

import com.elzhur.elzhur.models.Homework;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeworkRepository extends JpaRepository<Homework, Integer> {
}