package com.company;

public class Curs {
    private String cursname;
    private String number;
    private String teachername;
    private String teacherlastname;
    private String gropmassiv;

    public String getCursname() {
        return cursname;
    }

    @Override
    public String toString() {
        return "Curs{" +
                "cursname='" + cursname + '\'' +
                ", number='" + number + '\'' +
                ", teachername='" + teachername + '\'' +
                ", teacherlastname='" + teacherlastname + '\'' +
                ", gropmassiv='" + gropmassiv + '\'' +
                '}';
    }

    public void setCursname(String cursname) {
        this.cursname = cursname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public String getTeacherlastname() {
        return teacherlastname;
    }

    public void setTeacherlastname(String teacherlastname) {
        this.teacherlastname = teacherlastname;
    }

    public String getGropmassiv() {
        return gropmassiv;
    }

    public void setGropmassiv(String gropmassiv) {
        this.gropmassiv = gropmassiv;
    }

    public Curs(String cursname, String number, String teachername, String teacherlastname, String gropmassiv) {
        this.cursname = cursname;
        this.number = number;
        this.teachername = teachername;
        this.teacherlastname = teacherlastname;
        this.gropmassiv = gropmassiv;

    }
}
