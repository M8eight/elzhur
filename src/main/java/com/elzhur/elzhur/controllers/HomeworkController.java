package com.elzhur.elzhur.controllers;

import com.elzhur.elzhur.exceptions.HomeworkNotFoundException;
import com.elzhur.elzhur.models.Homework;
import com.elzhur.elzhur.repositories.HomeworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeworkController {
    @Autowired
    HomeworkRepository homeworkRepository;

    @GetMapping("/homeworks")
    List<Homework> all() {
       return homeworkRepository.findAll();
    }

    @PostMapping("/homeworks/")
    Homework newHomework(@RequestBody Homework newHomework) {
        return homeworkRepository.save(newHomework);
    }

    @GetMapping("/homeworks/{id}")
    Homework one(@PathVariable int id) {
        return homeworkRepository.findById(id).orElseThrow(() -> new HomeworkNotFoundException(id));
    }

    @PutMapping("/homeworks/{id}")
    Homework replaceHomework(@RequestBody Homework newHomework, @PathVariable int id) {
        return homeworkRepository.findById(id)
                .map(homework -> {
                    homework.setSubject(newHomework.getSubject());
                    homework.setText(newHomework.getText());
                return homeworkRepository.save(homework)})
                .orElseThrow(() -> new HomeworkNotFoundException()tFoundException(id));
    }
    
    @DeleteMapping("/homeworks/{id}")
    void deleteHomework(@PathVariable int id) {
        homeworkRepository.deleteById(id);
    }
}
