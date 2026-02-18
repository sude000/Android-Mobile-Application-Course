package com.sudeguler.javalearning;

public class Variables {
    public static void main(String[] args) {
        // Variables

        // Integer (32Bit) - Long (64Bit)

        int age = 20;
        System.out.println(10*age);
        System.out.println(age/5);

        int x = 5;
        int y = 11;

        System.out.println(y/x);

        long myLong = 10;
        System.out.println(myLong/5);

        // Double (64Bit) - Float (32Bit)

        double z = 5.0;
        double a = 11.0;

        System.out.println(a/z);

        float myFloat = 10.0f;
        System.out.println(myFloat/5);

        double pi = 3.14;
        int r = 5;
        // Calculate the perimeter of the circle
        System.out.println(2*pi*r);

        // String
        String name = "James";
        String surname = "Hetfield";

        // name = 40; >> Error

        String fullname = name + " " + surname;

        System.out.println(name);
        System.out.println(surname);

        System.out.println(fullname);

        // Boolean

        boolean isAlive = true;
        isAlive = false;
        System.out.println(isAlive);

        // Final

        final int myInteger = 5;
        System.out.println("myInteger: " + myInteger);

        // myInteger = 4; >> It gave an error because we wrote “final int”
        System.out.println("myInteger: " + myInteger );


    }

}
