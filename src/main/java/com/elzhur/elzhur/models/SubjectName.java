package com.elzhur.elzhur.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class SubjectName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @OneToOne(mappedBy = "subjectNameId")
    Subject subject;

    String name;

    //TODO Сделать учителей
    String teacher;
}
