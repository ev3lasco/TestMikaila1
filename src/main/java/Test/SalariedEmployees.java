package Test;

public class SalariedEmployees extends Employees implements IPayable{
    public SalariedEmployees(String name) {
        super(name);
    }

    private double salary;
    private String name;


    public static void printPay(double salary){
        System.out.println( "Salaries Employees pay is : "+ salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void calculateFinalPay() {
        System.out.println("Salaried Employees pay is" );
    }
}
