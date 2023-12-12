package Lesson4;

public class Sorting {
        public static void main(String[] args) {
            // Вхідний масив
            int[] arr = {64, 34, 25, 12, 22, 11, 90, 22, 66, 13};
            for (int i : arr) {
                System.out.print(i + " ");
            }

            System.out.println();

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            // Відсортований масив
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }

}
