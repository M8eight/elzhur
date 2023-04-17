package com.elzhur.elzhur.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "day_id", nullable = false)
    Day day;

    @OneToOne
    @JoinColumn(name = "subject_name_id", referencedColumnName = "id")
    SubjectName subjectNameId;

    @OneToOne
    @JoinColumn(name = "grade_id", referencedColumnName = "id")
    Grade grade;

    @OneToOne
    @JoinColumn(name = "homework_id", referencedColumnName = "id")
    Homework homework;

    @ManyToOne
    @JoinColumn(name = "school_class_id", nullable = false)
    SchoolClass schoolClass;

    String start_time;

    String end_time;
}

