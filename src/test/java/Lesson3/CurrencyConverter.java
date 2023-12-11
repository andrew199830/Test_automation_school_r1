package Lesson3;
    public class CurrencyConverter {
        private double commission;
        private double exchangeRate;

        //Конструктор
        public CurrencyConverter(double commission, double exchangeRate) {
            this.commission = commission;
            this.exchangeRate = exchangeRate;
        }

        //Метод конвертації долара в гривню
        private double convertUsdToUah(double amountInUsd) {
            return amountInUsd * exchangeRate;
        }

        // Метод обрахунку комісії
        private double calculateCommission(double amountInUah) {
            return (amountInUah * commission) / 100;  // Переводимо комісію з відсотків в десятковий формат (1% = 0.01)
        }

        // Метод обрахунку суми до виплати
        public double calculateTotalAmount(double amountInUsd) {
            double amountInUah = convertUsdToUah(amountInUsd);
            double commissionAmount = calculateCommission(amountInUah);
            return amountInUah - commissionAmount;
        }
    }


