import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        double usdToInr = 83.20;
        double eurToInr = 91.40;

        System.out.println("Choose Base Currency (USD/EUR): ");
        String baseCurrency = sc.next().toUpperCase();

        System.out.println("Enter amount to convert: ");
        double amount = sc.nextDouble();

        System.out.println("Choose Target Currency (INR): ");
        String targetCurrency = sc.next().toUpperCase();

        double converted = 0;

        if (baseCurrency.equals("USD") && targetCurrency.equals("INR")) {
            converted = amount * usdToInr;
        } else if (baseCurrency.equals("EUR") && targetCurrency.equals("INR")) {
            converted = amount * eurToInr;
        } else {
            System.out.println("Currency conversion not supported.");
            return;
        }

        System.out.printf("Converted Amount: %.2f %s\n", converted, targetCurrency);
    }
}