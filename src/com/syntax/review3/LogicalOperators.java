package com.syntax.review3;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean loginButtonDisplayed = true;
        boolean loginClickable = true;
        if (loginButtonDisplayed && loginClickable){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }

        System.out.println("-----------LOGICAL OR ---------------");

        boolean pictureDisplayed = true;
        String accountNAme = "Syntax";

        if (pictureDisplayed || accountNAme.equals("Syntax")){
            System.out.println("Login was successful");
        }else {
            System.out.println("User was not able to login");
        }

        System.out.println("----------------Logikal NOT-------------");


        boolean hungry = !true;
        System.out.println(hungry);

        boolean cold = !false;
        System.out.println(cold);



        String str = "Hello";

        if (!str.equals("Hello")){
            System.out.println("Value of the string sis NOT Hello");
        }



        boolean confirmSelected = false;
        if (!confirmSelected){
            System.out.println("Let's click on confirm checkbox");
        }
        System.out.println("Click on Pay button");





















    }
}
