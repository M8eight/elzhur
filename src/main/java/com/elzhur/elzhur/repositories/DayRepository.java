package com.elzhur.elzhur.repositories;

import com.elzhur.elzhur.models.Day;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayRepository extends CrudRepository<Day, Long> {
}
