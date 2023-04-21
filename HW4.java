package class4;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which city?");
        String city = scanner.next();
        System.out.println(city);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("What temperature");
        double farenheit = scanner1.nextDouble();
        double celsius = (farenheit - 32) / 1.8;
        System.out.println("The temperature is the city " + city + " is " + celsius);

    }
}
