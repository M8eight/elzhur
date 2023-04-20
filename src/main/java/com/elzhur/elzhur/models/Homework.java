package com.elzhur.elzhur.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Homework {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String text;

    //TODO Сделать приклепление файлов

    @OneToOne(mappedBy = "homework")
    Subject subject;

    public Homework(String text, Subject subject) {
        this.text = text;
        this.subject = subject;
    }
}
