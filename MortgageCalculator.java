import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
       final byte Month_IN_Year = 12;
       final byte PERCENT = 100;

       Scanner scanner = new Scanner(System.in);
        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Annual Interest Rate;");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterestRate = annualInterestRate/PERCENT/Month_IN_Year;

        System.out.println("Period Years: " );
        int periodYears = scanner.nextInt();
        int numberOfPayments = periodYears*Month_IN_Year;

        Double Mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))/
                (Math.pow(1+monthlyInterestRate,numberOfPayments)-1);


        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(Mortgage);
        System.out.println("MOrtgage:" + mortgageFormatted );
    }
}
