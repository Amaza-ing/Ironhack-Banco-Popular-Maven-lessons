package com.ironhack.w1.d3;

public class Main {
    public static void main(String[] args) {
        Movie harryPotter = new Movie("Harry Potter", 120);
        Movie lotr = new Movie("Lord of the Rings", 200);
        Movie madMax = new Movie("Mad max");

        System.out.println(harryPotter.getTitle() + " - " + harryPotter.getDuration());
        System.out.println(lotr.getTitle() + " - " + lotr.getDuration());
        System.out.println(harryPotter);
        System.out.println(madMax.getTitle() + " - " + madMax.getDuration());
        harryPotter.play();
        Movie.displayAlert();
        System.out.println(harryPotter.IS_GOOD);

        HorrorMovie scream = new HorrorMovie("Scream", 80, false);
        System.out.println(scream.getTitle() + " - " + scream.getDuration() + " - " + scream.isReallyScary());
        scream.play();
        System.out.println(scream);
    }
}
