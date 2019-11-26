package org.skni.student_was.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:task.properties")
public class Task {

    @Value("${task.description}")
    private String description;

    public Task () {

    }

    @Override
    public String toString (){
        return description;
    }
}
