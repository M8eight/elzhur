package com.elzhur.elzhur.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Day {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    Long id;

    @ManyToOne
    @JoinColumn(name = "week_id", nullable = false)
    Week week;

    @OneToMany(mappedBy = "day")
    List<Subject> subjects;

    @Column(nullable = false)
    Date date;

    public Day(Week week, Date date) {
        this.week = week;
        this.date = date;
    }
}
