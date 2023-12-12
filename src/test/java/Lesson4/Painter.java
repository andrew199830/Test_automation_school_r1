package Lesson4;


public class Painter {
    public static void main(String[] args) {
        int size = 5; // Висота половини ромба

        // Верхня половина ромба
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Нижня половина ромба
        for (int i = size - 2; i >= 0; i--) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}


