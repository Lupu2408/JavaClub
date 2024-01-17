package week02;

public class _01_StringMethods {

    public static void main(String[] args) {

        String fullName = "lupu david";

       String firstFL = Character.toString(fullName.charAt(0));
        String secondFL = Character.toString(fullName.charAt(0));

        System.out.println(firstFL.toUpperCase().concat(fullName.substring(1,3)));

    }
}
