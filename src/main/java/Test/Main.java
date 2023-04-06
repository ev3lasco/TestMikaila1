package Test;

public class Main {
    public static void main(String[] args) {
//        HourlyEmployee Edwin = new HourlyEmployee("Edwin");
//        SalariedEmployees Deer = new SalariedEmployees("Deer");
//        HourlyEmployee Darius = new HourlyEmployee("Darius");
//
//        Darius.printBadges();
//        Edwin.printBadges();
//        Deer.printBadges();
//
       HourlyEmployee.printPay(15, 40);
       SalariedEmployees.printPay( 5000);
        Entrepenuers.printPay( 15000,4500);
        Entrepenuers dog = new Entrepenuers("Edwin",500, 800);
        System.out.println(dog);
        Entrepenuers cat = new Entrepenuers("ed", 1 , 2 );


        Person.printpay(new IPayable[]);











    }
}
