package week04;

import java.util.Scanner;

public class _01_if_elseif {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int number = scan.nextInt();
        int reminder = number % 4;
        if (reminder == 3){
            System.out.println("Remainder is 3");
        }else if(reminder == 2){
            System.out.println("Remainder is 2");

        }else if (reminder == 1)
            System.out.println("Remainder is 1");
        else {
            System.out.println("Remainder is 0");
        }

    }

}
