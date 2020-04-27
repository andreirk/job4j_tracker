package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static int numberOfStudents = 10;
    public static void main(String[] args) {
        for(int i = 0; i < College.numberOfStudents; i++){
            Student student = new Student();
            String name = "Name" + i;
            String sname = "Family" + i;
            String patername = "Patername" + i;
            String groupNum = "5467" + i;
            Date enterDate = new Date(i * 22454065567L);
            student.setFIO(name + sname + patername);
            student.setDateOfEnter(enterDate);
            student.setGroup(groupNum);
            System.out.println(student);
        }
    }
}
