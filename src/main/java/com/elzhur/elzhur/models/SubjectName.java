package com.elzhur.elzhur.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class SubjectName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @OneToMany(mappedBy = "subjectName")
    List<Subject> subject;

    String name;

    //TODO Сделать учителей
    String teacher;

    public SubjectName(String name, String teacher) {
        this.name = name;
        this.teacher = teacher;
    }
}
