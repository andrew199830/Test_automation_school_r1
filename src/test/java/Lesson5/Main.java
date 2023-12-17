package Lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть дріб чисельник 1:");
        int numerator1 = scanner.nextInt();
        System.out.print("Введіть дріб знаменник 1:");
        int denumerator1 = scanner.nextInt();

        System.out.print("Введіть дріб чисельник 2:");
        int numerator2 = scanner.nextInt();
        System.out.print("Введіть дріб знаменник 2:");
        int denumerator2 = scanner.nextInt();

        scanner.close();

        Fraction firstFraction = new Fraction(numerator1, denumerator1);
        Fraction secondFraction = new Fraction(numerator2, denumerator2);

        System.out.println(firstFraction.toString());
        System.out.println(secondFraction.toString());
        System.out.println(firstFraction.equals(secondFraction));

    }
}
