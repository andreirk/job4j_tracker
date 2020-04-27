package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String FIO;
    private String group;
    private Date dateOfEnter;

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getDateOfEnter() {
        return dateOfEnter;
    }

    public void setDateOfEnter(Date dateOfEnter) {
        this.dateOfEnter = dateOfEnter;
    }

    @Override
    public String toString() {
        return "Student " + this.getFIO() + " from " + this.getGroup() + " has entered in " + this.getDateOfEnter();
    }
}
