package opgave02;

import java.util.Scanner;

public class BookExercise2_1 {
    public static void main(String[] args) {
        System.out.println("enter miles to convert");
        Scanner scanner = new Scanner(System.in);
        double miles = scanner.nextDouble();
        System.out.println(miles *1.6);
    }
}
