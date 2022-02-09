package com.company;

public class Group {
    private String massiv;
    private String lerning;
    private String startday;

    public Group(String massiv, String lerning, String startday) {
        this.massiv = massiv;
        this.lerning = lerning;
        this.startday = startday;
    }

    @Override
    public String toString() {
        return "Group{" +
                "massiv='" + massiv + '\'' +
                ", lerning='" + lerning + '\'' +
                ", startday='" + startday + '\'' +
                '}';
    }

    public String getMassiv() {
        return massiv;
    }

    public void setMassiv(String massiv) {
        this.massiv = massiv;
    }

    public String getLerning() {
        return lerning;
    }

    public void setLerning(String lerning) {
        this.lerning = lerning;
    }

    public String getStartday() {
        return startday;
    }

    public void setStartday(String startday) {
        this.startday = startday;
    }
}
