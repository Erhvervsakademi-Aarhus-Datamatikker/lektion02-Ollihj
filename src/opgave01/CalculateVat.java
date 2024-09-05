package opgave01;

import java.util.Scanner;

public class CalculateVat {
    public static void main(String[] args) {
        //Beskriv din algoritme
        System.out.println("indtast beløb");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        System.out.println(amount*1.25);
    }
}
