package com.elzhur.elzhur.requests;

import com.elzhur.elzhur.models.*;
import com.elzhur.elzhur.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DbRequests {
    DayRepository dayRepository;
    SchoolClassRepository schoolClassRepository;
    SubjectNameRepository subjectNameRepository;
    SubjectRepository subjectRepository;
    WeekRepository weekRepository;
    GradeRepository gradeRepository;
    HomeworkRepository homeworkRepository;

    @Autowired
    public DbRequests(DayRepository dayRepository, SchoolClassRepository schoolClassRepository, SubjectNameRepository subjectNameRepository, SubjectRepository subjectRepository, WeekRepository weekRepository, GradeRepository gradeRepository, HomeworkRepository homeworkRepository) {
        this.dayRepository = dayRepository;
        this.schoolClassRepository = schoolClassRepository;
        this.subjectNameRepository = subjectNameRepository;
        this.subjectRepository = subjectRepository;
        this.weekRepository = weekRepository;
        this.gradeRepository = gradeRepository;
        this.homeworkRepository = homeworkRepository;
    }

    public void createWeek() {
        weekRepository.save(new Week());
    }

    public void createDay(int weekId, Date date) {
        dayRepository.save(new Day(weekRepository.findById(weekId).orElseThrow(), date));
    }

    public void createSchoolClass(String classname) {
        schoolClassRepository.save(new SchoolClass(classname));
    }

    //TODO Учителя схемы нету нормальной
    public void createSubjectName(String name, String teacher) {
        subjectNameRepository.save(new SubjectName(name, teacher));
    }

    public void createGrade(String name) {
        gradeRepository.save(new Grade(name));
    }

    public void createHomework(String text, long subjectId) {
        homeworkRepository.save(new Homework(text, subjectRepository.findById(subjectId).orElseThrow()));
    }

    public void createSubject(long dayId, int subjectNameId, int schoolClassId, String startTime, String endTime) {
        subjectRepository.save(new Subject(dayRepository.findById(dayId).orElseThrow(),
                subjectNameRepository.findById(subjectNameId).orElseThrow(),
                schoolClassRepository.findById(schoolClassId).orElseThrow(),
                startTime, endTime));
    }

    //TODO Сделать тесты для проверки всего этого
}
