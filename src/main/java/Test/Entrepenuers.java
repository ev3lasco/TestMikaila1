package Test;

public class Entrepenuers extends Person implements IPayable{

    private double revenue;
    private double expense;

    public Entrepenuers(String name,double expense, double revenue){
        super(name);
        this.expense = expense;
        this.revenue = revenue;
    }
    public static void printWeeklyPay(double revenue, double expense){
        System.out.println(  "Entreprnuers Pay is :" + (revenue - expense));
    }


    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    @Override
    public String toString(){
        return "Entreprenuer " + "{name is  " +  getName() + "  revenue is " + " " + this.revenue + "  Expenses are  " + this.expense + "}";
    }
    @Override
    public void printBadges() {

    }

    @Override
    public void calculateFinalPay() {
        System.out.println( "Entreprenuer's pay is :");
    }
}
