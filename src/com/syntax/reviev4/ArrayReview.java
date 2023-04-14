package com.syntax.reviev4;

public class ArrayReview {
    public static void main(String[] args) {


        int [] arr = new int[3];
        //we store elements based on indexes
        arr[0] = 10;
        arr[1] = 11;
        //arr[3] = 12;  // ArrayIndexOutOfBoundsException

        for (int a :arr){
            System.out.print(a+" ");
        }
        System.out.println();

        //access also by indexes
        System.out.println(arr[2]);  // 0 by default

        System.out.println("---------------------------");

        String [] planets = {"Mercury", " Venus", " Earth", " Mars"," Jupiter"};

        for (int j = 0; j < planets.length; j++) {
            System.out.print(planets[j]+" ");
        }

    }
}
