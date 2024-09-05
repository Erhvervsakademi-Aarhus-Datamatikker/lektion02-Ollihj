package opgave03;

import java.util.Scanner;

public class BookExercise2_2 {
    public static void main(String[] args) {
        System.out.println("enter the sides");
        Scanner scanner = new Scanner(System.in);
        double sidesLength = scanner.nextDouble();
        double area = Math.sqrt(3)/4*Math.pow(sidesLength,2);
        System.out.println("the area is " + area);
        double volume = area * sidesLength;
        System.out.println("the volume is " + volume);
    }
}
