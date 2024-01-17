package week03;

import java.util.Scanner;

public class _02_ifelse_statement {

    public static void main(String[] args) {

        Scanner scanN = new Scanner(System.in);
        System.out.println("Enter red/green: ");
        String color = scanN.next();
        if (color.equals("red")){
            System.out.println("Stop!");
    }

        if (color.equals("green")) {
            System.out.println("Stop");
        }


}}
