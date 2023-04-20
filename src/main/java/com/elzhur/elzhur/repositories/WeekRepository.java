package com.elzhur.elzhur.repositories;

import com.elzhur.elzhur.models.Week;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeekRepository extends CrudRepository<Week, Integer> {
}