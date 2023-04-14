package com.syntax.review3;

import java.util.Scanner;

public class WhileLoopScanner {
    public static void main(String[] args) {

        /*
        you need to ask user to enter numbers 1 by 1
         until users not integer value - then loop should stop

         inside loop we need to calculate the sum of all entered numbers

         */

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.println("Please ENTER integer values");
        while(scan.hasNextInt()) {
            int num = scan.nextInt();
            sum += num;
        }
        System.out.println("Sum ="+sum);
    }
}
