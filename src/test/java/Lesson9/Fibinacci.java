package Lesson9;
import java.util.stream.Stream;

public class Fibinacci {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                .limit(n+1 )
                .reduce((a, b) -> b)
                .orElse(new int[]{0, 1})[0];
    }

    public static void main(String[] args) {
        int n = 9; // Index of Fibonacci
        System.out.println("Fibonacci F(" + n + ") is " + fibonacci(n));
    }
}
