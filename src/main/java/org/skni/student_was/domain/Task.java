package org.skni.student_was.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:task.properties")
@Scope("prototype")
public class Task {

    @Value("${task.description}")
    private String description;

    public Task () {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString (){
        return description;
    }
}
