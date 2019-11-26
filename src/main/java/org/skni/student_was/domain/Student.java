package org.skni.student_was.domain;

public class Student{
    private String name;
    private int year;
    private Task task;

    public Student (String name, int year, Task task){
        this.name= name;
        this.year=year;
        this.task=task;
    }



    public void setTask(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    @Override
    public String toString(){
        return "Student " + name + " jets na " + year + " roku studiów. ta osoba ma takie zaległości: " + task;
    }
}
