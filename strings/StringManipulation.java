package strings;

import java.util.Arrays;

import entities.Salary;

public class StringManipulation {
    // csv like

    public static void main(String[] args) {
        String s = "Durand;Marcel;2 523.5";

        char firstChar = s.charAt(0);
        int semiColonIndex = s.indexOf(';');
        System.out.println("first character: " + firstChar);
        System.out.println("length: " + s.length());
        System.out.println("first semi colon index: " + semiColonIndex);

        String lastName = s.substring(0, semiColonIndex);

        System.out.println("last name: " + lastName);
        System.out.println(lastName.toLowerCase());
        System.out.println(lastName.toUpperCase());

        String[] fields = s.split(";");
        System.out.println("CSV fields: " + Arrays.toString(fields));

        Salary marcelDurand = new Salary(s);
        System.out.println(marcelDurand.toString());

    }

}
