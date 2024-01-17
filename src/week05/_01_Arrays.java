package week05;


import java.util.Scanner;

public class _01_Arrays {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arr1 = {12, 14, 11, 15, 10, 17, 18, 19, 20, 22};
        int mn = 99, max = -1;

        for(int i = 0; i < arr1.length; i++) {
            if (arr1[i] < mn)
            {
                mn = arr1[i];
            }

            if (arr1[i] > max) {
                max =  arr1[i];
            }
        }
        System.out.println(mn);
        System.out.println(max);
    }

}
