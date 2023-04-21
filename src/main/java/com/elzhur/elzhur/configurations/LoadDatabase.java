package com.elzhur.elzhur.configurations;

import com.elzhur.elzhur.repositories.*;
import com.elzhur.elzhur.requests.DbRequests;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(DbRequests dbRequests) {
        return args -> {
            dbRequests.createWeek();

            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.DAY_OF_MONTH, +1);
            dbRequests.createDay(1, calendar.getTime());

            dbRequests.createSchoolClass("9A");

            dbRequests.createSubjectName("Математика", "Камила Рузиева");

            dbRequests.createGrade("5");

            dbRequests.createSubject(1, 1, 1, "12:00", "13:10");

            dbRequests.createHomework("Сделать дз блять", 1);
        };
    }
}
