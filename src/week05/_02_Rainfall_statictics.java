package week05;

import java.util.Scanner;

public class _02_Rainfall_statictics {
    public static void main(String[] args) {

        Scanner scanP = new Scanner(System.in);

        double arr[] = new double[12];
        double sum = 0, max = 0, min = 9999;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanP.nextDouble();
        }

        for (int i = 0; i < arr.length; i++) {
            sum =sum + arr[i];
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }

        System.out.println("Total rainfall = " + sum);
        System.out.println("Average rainfall = " + sum / arr.length);
        System.out.println("Max rainfall = " + max);
        System.out.println("Min rainfall = " + min);
        }
    }



