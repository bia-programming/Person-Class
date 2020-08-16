package com.company;

public class Person {
    private double kg;
    private String eyeColor;

    public Person(){

    }

    public Person(double kg){
        this.kg=kg;
    }

    public Person(String eyeColor){
        this.eyeColor=eyeColor;
    }

    public Person(double kg, String eyeColor){
        this.eyeColor=eyeColor;
        this.kg=kg;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
}
