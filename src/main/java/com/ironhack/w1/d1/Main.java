package com.ironhack.w1.d1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello Ironhackers");


//        DATA TYPES

        byte myByte = 127;
        short myShort = 1000;
        int myInt = 999999;
        double myDouble = 12.3456;
        boolean isBoolean = true;
        char myChar = 100;

        System.out.println("myByte = " + myByte);
        System.out.println("myShort = " + myShort);
        System.out.println("myInt = " + myInt);
        System.out.println("myDouble = " + myDouble);
        System.out.println("isBoolean = " + isBoolean);
        System.out.println("myChar = " + myChar);

        myInt = 1234;
        System.out.println("myInt = " + myInt);

        String myString = "Hola mundo";
        System.out.println(myString);


//        OPERATORS

        int number = 10;
        double doubleNumber = 10;

        System.out.println(number + 5);
        System.out.println(number - 5);
        System.out.println(number * 5);
        System.out.println(number / 3);
        System.out.println(doubleNumber / 3);
        System.out.println(1.2 - 1.1);
        System.out.println(number % 3);

//        the next 3 lines are equivalent
//        number++;
//        number = number + 1;
//        number += 1;

        System.out.println(number++);
        System.out.println(number);
        System.out.println(++number);


//        CONDITIONALS

        number = 5001;

        if (number >= 1000 && number <= 10000) {
            System.out.println("Number está comprendido entre 1000 y 10000");
        } else if (number == 0) {
            System.out.println("Number es igual a 0");
        } else {
            System.out.println("Number es menor que 1000 o mayor que 10000");
        }

        if (number >= 10 || number <= -10) {
            System.out.println("Number tiene más de 2 cifras");
        }

        if (number % 2 == 0) System.out.println("number is even");
        else System.out.println("number is odd");

        if (!isBoolean) System.out.println("is true");


        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }


        double mark = 6.5;
        boolean hasPassed = mark >= 5 ? true : false;


//        WRAPPERS

        Integer myInteger = 100;
        System.out.println(myInteger);



        myMethod();
        myMethod();
        myMethod();

        String info = getInfo(2);
        System.out.println(info);


//        STRING METHODS

        String address = "Fake Street, 123";

        System.out.println("address length: " + address.length());
        System.out.println(address.toUpperCase());
        System.out.println(address.toUpperCase().replace("E", "-"));

        String address2 = "Fake Street, 123";

        if (address.equals(address2)) System.out.println("it's the same address");
        else System.out.println("they are different address");

    }

//    METHODS

    public static void myMethod() {
        System.out.println("this");
        System.out.println("is");
        System.out.println("inside");
        System.out.println("myMethod");
    }

    public static String getInfo(int option) {
        if (option == 1) return "My name is Adrián";
        else if (option == 2) return "This is an Ironhack bootcamp";
        return "option " + option + " provides no info";
    }
}