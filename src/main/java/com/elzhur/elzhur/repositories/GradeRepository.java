package com.elzhur.elzhur.repositories;

import com.elzhur.elzhur.models.Grade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends CrudRepository<Grade, Integer> {
}
