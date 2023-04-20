package com.elzhur.elzhur.repositories;

import com.elzhur.elzhur.models.SchoolClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolClassRepository extends CrudRepository<SchoolClass, Integer> {
}