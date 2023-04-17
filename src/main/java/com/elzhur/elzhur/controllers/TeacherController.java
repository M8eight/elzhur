package com.elzhur.elzhur.controllers;

import com.elzhur.elzhur.models.Subject;
import com.elzhur.elzhur.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("subject-rest")
public class TeacherController {

//    @Autowired
//    private SubjectRepository subjectRepository;
//
//    @GetMapping(value = "/{id}", produces = "application/json")
//    public Subject getSubject(@PathVariable Ling id) {
//        return
//    }
}
