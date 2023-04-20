package com.elzhur.elzhur.repositories;

import com.elzhur.elzhur.models.SubjectName;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectNameRepository extends CrudRepository<SubjectName, Integer> {
}