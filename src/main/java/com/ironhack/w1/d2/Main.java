package com.ironhack.w1.d2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        ARRAYS

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(days);
        System.out.println(days[0]);
        System.out.println(Arrays.toString(days));
        Arrays.sort(days);
        System.out.println(Arrays.toString(days));

        String[] subjectsArray = createSubjectsArray();
        System.out.println(subjectsArray[2]);
        System.out.println(subjectsArray.length);


//        FOR LOOP

        for (int i = 0; i < subjectsArray.length; i++) {
//            if (subjectsArray[i].equals("Language")) continue;
            System.out.println(i + " " + subjectsArray[i]);
//            if (subjectsArray[i].equals("History")) break;
        }

        int[] evenNumbers = new int[51];
        int j = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                evenNumbers[j] = i;
                j++;
            }
        }

        System.out.println(Arrays.toString(evenNumbers));


//        FOREACH LOOP

        for (int number : evenNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();


//        WHILE LOOP

        int counter = 0;
        while (counter < evenNumbers.length) {
            counter++;
        }
        System.out.println("Counter: " + counter);


//        DO WHILE LOOP

        counter = 100;
        do {
            counter++;
        } while (counter < evenNumbers.length);
        System.out.println("Counter: " + counter);


//        MATH CLASS & CASTING

        System.out.println(Math.sqrt(64));
        System.out.println((int) Math.pow(2, 5));
        System.out.println((int) 3.72);
        System.out.println(Math.ceil(3.72));


//        ARRAYLIST

        List<String> countries = new ArrayList<>();
        countries.add("Puerto Rico");
        countries.add("Spain");
        countries.add("France");
        System.out.println(countries);
        System.out.println(countries.get(0));
        countries.set(2, "Italy");
        System.out.println(countries);
        System.out.println(countries.size());
        countries.remove(2);
        System.out.println(countries);

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }

        List<Integer> integerList = new ArrayList<>();


//        ADD ELEMENTS TO ARRAY

        int[] numbers = {0, 1, 2, 3, 4};
//        numbers[5] = 5; // This cannot be done with an array

        int[] newArray = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            newArray[i] = numbers[i];
        }
        newArray[5] = 5;





    }

    public static String[] createSubjectsArray() {
        String[] subjects = new String[5];
        subjects[0] = "Math";
        subjects[1] = "Language";
        subjects[2] = "History";
        subjects[3] = "Biology";
        subjects[4] = "Chemistry";

        return subjects;
    }
}
