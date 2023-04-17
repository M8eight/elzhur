package com.elzhur.elzhur.repositories;

import com.elzhur.elzhur.models.Subject;
import org.springframework.data.repository.CrudRepository;

interface SubjectRepository extends CrudRepository<Subject, Long> {
}
