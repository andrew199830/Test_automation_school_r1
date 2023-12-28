package Lesson6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {



        Map<Integer, Cup> map = new HashMap<>();

        map.put(1, new Cup(1, "A"));
        map.put(2, new Cup(2, "B"));
        map.put(3, new Cup(3, "C"));
        map.get(1);
        map.remove(1);
        System.out.println(map.size());
//        map.putIfAbsent(1, "one");
//        map.putIfAbsent(1, "two");

//        String a = map.get(1);
//        String b = map.get(65);


        System.out.println("This is get map get" + map.getOrDefault(54, new Cup(999, "YYY")));

//        map.containsKey(1);
//        map.containsValue("one");
//        System.out.println(map.toString());

        for(Map.Entry<Integer, Cup> entry: map.entrySet()){
            System.out.println("Key is: " + entry.getKey() + "value +" + entry.getValue().toString());
        }


//         Box<Cup> box = new Box<>(1, 2, 3);
//         box.putContent(new Cup(400, "Black"));
//
//        List<Integer> list1 = Arrays.asList(1, 2, 3);
//        List<Double> list2 = Arrays.asList(1d, 2d, 3d);
//
//        System.out.println("Sum of list1: " + getSum(list1));
//        System.out.println("Sum of list2: " + getSum(list2));
//    }
//
//    private static double getSum(List<? extends Number> list) {
//        double sum = 0.0;
//        for (Number i : list) {
//            sum += i.doubleValue();
//        }
//        return sum;




    }
}
