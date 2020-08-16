package com.company;

public class Main {

    public static void main(String[] args) {
	    Person persoana = new Person(80, "blue");
        Person stranger = new Person(persoana.getKg(),persoana.getEyeColor());
        System.out.println(stranger.getKg());
        System.out.println(stranger.getEyeColor() +"\n");

        stranger.setKg(stranger.getKg());
        stranger.setEyeColor(stranger.getEyeColor());

        stranger.setEyeColor("green");
        stranger.setKg(98);
        System.out.println(stranger.getKg());
        System.out.println((stranger.getEyeColor()));

    }
}
