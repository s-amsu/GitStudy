package practice;

import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int number = input.nextInt();

        if( number == 0)
        {
            System.out.println("Number is equal to zero");}
        else if (number > 0) {
            System.out.println("Number is positive");}
        else {
            System.out.println("Number is negative");
        }

    }
}





