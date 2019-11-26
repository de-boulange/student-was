package org.skni.student_was.domain;

public class Task {
    private String description;

    public Task (String description) {
        this.description= description;
    }

    @Override
    public String toString (){
        return description;
    }
}
