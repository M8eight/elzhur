package com.elzhur.elzhur.exceptions;

public class HomeworkNotFoundException extends RuntimeException {
    HomeworkNotFoundException(int id) {
        super("Could not find employee " + id);
    }
}
