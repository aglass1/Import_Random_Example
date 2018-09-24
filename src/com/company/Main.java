package com.company;
import java.util.Random; // Added 'Random' directory

public class Main {

    public static void main(String[] args)

    {
        Random r = new Random(); // Created new instance of random called 'r'
        System.out.println(r.nextInt(10)); // Output random number between 0 and 9
    }
}
