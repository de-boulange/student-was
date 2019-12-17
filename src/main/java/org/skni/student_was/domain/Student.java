package org.skni.student_was.domain;

import org.hibernate.validator.constraints.Range;
import org.skni.student_was.utils.IdGenerator;
import org.springframework.cglib.proxy.Mixin;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    @Size(min = 2, max = 40, message = "Imie studenta musi miec miedzy 2, a 40 znakow")
    private String name;

    @NotNull
//    @Min(1)
//    @Max(6)
    @Range(min=1, max=6, message = "Student musi być na 1-6 semestrze")
    private int semester;

    @OneToOne
    private Task task;

    public Student (String name, int semester) {
        this.name = name;
        this.semester = semester;
//        id = IdGenerator.getUniqueId();
    }

    public Student () {
//        id = IdGenerator.getUniqueId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    @Override
    public String toString(){
        return "Student " + name + " jest na " + semester + " semestrze. Ta osoba ma takie zaległości: " + task;
    }
}
