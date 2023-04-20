package com.elzhur.elzhur.controllers;

import com.elzhur.elzhur.requests.DbRequests;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Calendar;

@Controller
public class ServerSideController {
    @Autowired
    DbRequests dbRequests;

    @GetMapping("/create")
    String createReq() {
        dbRequests.createWeek();

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, +1);
        dbRequests.createDay(1, calendar.getTime());

        dbRequests.createSchoolClass("9A");

        dbRequests.createSubjectName("Математика", "Камила Рузиева");

        dbRequests.createGrade("5");

        dbRequests.createSubject(1, 1, 1, "12:00", "13:10");

        return "home";
    }
}
