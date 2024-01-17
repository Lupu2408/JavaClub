package week03;

import java.util.Scanner;

public class _01_endsWith {

    public static void main(String[] args) {

        Scanner scanP = new Scanner(System.in);
        System.out.print("Enter 3 digit number: ");
        int num = scanP.nextInt();
        System.out.println("num = " + num);

        int ones = num % 10;
        System.out.println("ones = " + ones);

        int tens = (num / 10) % 10;
        System.out.println("tens = " + tens);

        int hundreds = (num / 100) % 10;
        System.out.println("hundreds = " + hundreds);

        System.out.println(ones * 100 + tens * 10 + hundreds);

    }

}
