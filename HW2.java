package class4;

import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How much do you need?");
        int loanAmount = scanner.nextInt();
        if (loanAmount <= 200000){
            System.out.println("The Bank approved your request");
        }else {
            System.out.println("Unfortunately this amount was not approved by the Bank");
        }
    }
}
