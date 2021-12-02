public class WageCalculatorMain {

    public static void main(String[] args) {
        WageCalculator compute = new WageCalculator();
        compute.setBaseSalary(500);
        compute.setHourlyPay(20);
         int finalWage = compute.calcualteWage(200);
        System.out.println(finalWage);

    }
}
