package Test;

public class HourlyEmployee extends Employees implements IPayable {
    public HourlyEmployee(String name) {
        super(name);
    }
     private double hourlyrate;
    private double hoursWorked;

    public static void printWeeklyPay (double hourlyrate, double hoursWorked){
        System.out.println((hourlyrate * hoursWorked));
    }

    public double getHourlyrate() {
        return hourlyrate;
    }

    public void setHourlyrate(double hourlyrate) {
        this.hourlyrate = hourlyrate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculateFinalPay() {
        System.out.println("Hourly Employee pay is :" );

    }
}
