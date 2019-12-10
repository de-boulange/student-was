package org.skni.student_was.domain;

public class Student {

    private String name;

    private int semester;

    private Task task;

    public Student (String name, int semester) {
        this.name = name;
        this.semester = semester;
    }

    public Task getTask() {
        return task;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() { return semester; }

    public void setSemester(int semester) { this.semester = semester; }

    public void setTask(Task task) { this.task = task; }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student " + name + " jest na " + semester + " roku studiów. Ta osoba ma takie zadanie: " + task;
    }
}
