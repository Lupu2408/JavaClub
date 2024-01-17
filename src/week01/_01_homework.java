package week01;

import java.util.Scanner;

public class _01_homework {

    public static void main(String[] args) {

        String name;
        String address;
        String telephonenumber;
        byte favouritenumber;
        Scanner cin = new Scanner(System.in);
        Scanner cinn = new Scanner(System.in);

        System.out.println("what is your name?");
        name=cinn.nextLine();

        System.out.println(name);

        System.out.println("what is your adress?");
        address=cinn.nextLine();
        System.out.println(address);

        System.out.println("what is your favourite number?");
        favouritenumber=cin.nextByte();
        System.out.println(favouritenumber);

        System.out.println("what is your telephone number?");
        telephonenumber=cinn.nextLine();
        System.out.println(telephonenumber);

    }
}
