package Lesson3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Ініціалізація Scaner для вводу
        Scanner scanner = new Scanner(System.in);
        //Створення нового екземпляру класу CurrencyConverter
        CurrencyConverter converter = new CurrencyConverter(1, 36.55);

        System.out.print("Введіть суму USD для конвертації:");
        double amountInUsd = scanner.nextDouble();

        //Конвертація та обрахунок суми виплати
        double totalAmountInUah = converter.calculateTotalAmount(amountInUsd);

        System.out.println("Загальна сума в гривнях: " + totalAmountInUah);

        scanner.close();
    }
}
