package com.company;

import java.time.LocalDate;

public class Student {
    private LocalDate birthday;
    private String name;
    private String lastname;
    private String mail;

    @Override
    public String toString() {
        return "Student{" +
                "birthday=" + birthday +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Student(LocalDate birthday, String name, String lastname, String mail) {
        this.birthday = birthday;
        this.name = name;
        this.lastname = lastname;
        this.mail = mail;

    }
}
