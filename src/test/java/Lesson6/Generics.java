package Lesson6;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);

        int sum = 0;
        for (int number : list) {
            sum += number;
        }

        System.out.println("Sum: " + sum);
    }
}
