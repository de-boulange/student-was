package org.skni.student_was.domain;

import javax.persistence.*;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "opis")
    private String description;

    public Task (String description) {
        this.description = description;
    }

    public Task () { }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString (){
        return "Task[description="
                + description
                + "]";
    }
}
