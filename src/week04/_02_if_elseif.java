package week04;

import java.util.Scanner;

public class _02_if_elseif {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a < b){
            System.out.println("a is the smallest = " + a);
        }else if (b < a && b < c){
            System.out.println("b is the smallest = " + b);
        }else {
            System.out.println("c is the smallest = " + c);
        }
    }
}
