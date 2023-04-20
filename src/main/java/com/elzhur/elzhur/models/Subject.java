package com.elzhur.elzhur.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
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

    @ManyToOne
    @JoinColumn(name = "subject_name_id", referencedColumnName = "id", nullable = false)
    SubjectName subjectName;

    @ManyToOne
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

    public Subject(Day day, SubjectName subjectName, SchoolClass schoolClass, String start_time, String end_time) {
        this.day = day;
        this.subjectName = subjectName;
        this.schoolClass = schoolClass;
        this.start_time = start_time;
        this.end_time = end_time;
    }
}

