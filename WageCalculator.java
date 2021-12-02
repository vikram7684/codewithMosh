public class WageCalculator {

    private int baseSalary;
    private int hourlyPay;

    public int calcualteWage(int extraHours){
return baseSalary +(hourlyPay * extraHours);
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        if(baseSalary<0)
            throw new IllegalArgumentException();
        this.baseSalary = baseSalary;
    }

    public int getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(int hourlyPay){
        this.hourlyPay = hourlyPay;
    }
}

