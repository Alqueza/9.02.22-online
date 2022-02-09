package com.company;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Student student = new Student(LocalDate.of(2003,11,11),
                "Adilet",
                "Otorbaev",
                "adilet_otor@Mail.ru");
        System.out.println(student);
        System.out.println();

        Group group = new Group("6","SpaceSky","09.02.22");
        System.out.println(group);
        System.out.println();

        Curs curs = new Curs("Java",
                "+996706157252",
                "Rasul",
                "Kadyrov",
                "15");
        System.out.println(curs);   
    }
}
