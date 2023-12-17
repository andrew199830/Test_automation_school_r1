package Lesson5;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

    }

    //Знаходження найбільшого спільного дільника
    private static int greatestCommonDenominator(int a, int b) {
        return b == 0 ? a : greatestCommonDenominator(b, a % b);
    }

    // Знаходження найменшого спільного кратного
    private static int leastCommonMultiple(int a, int b) {
        return a / greatestCommonDenominator(a, b) * b;
    }

    // Перевизначення методу equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Fraction other = (Fraction) obj;

        int commonDenominator = leastCommonMultiple(this.denominator, other.denominator);
        int thisNumerator = (commonDenominator / this.denominator) * this.numerator;
        int otherNumerator = (commonDenominator / other.denominator) * other.numerator;

        return thisNumerator == otherNumerator;
    }

    // Перевизначення toString для виводу дробів
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
