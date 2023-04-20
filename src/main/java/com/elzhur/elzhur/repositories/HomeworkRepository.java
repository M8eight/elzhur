package com.elzhur.elzhur.repositories;

import com.elzhur.elzhur.models.Homework;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeworkRepository extends CrudRepository<Homework, Integer> {
}