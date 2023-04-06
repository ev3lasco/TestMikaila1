package Test;

public abstract class Person implements IPayable {
    private String name;


    public Person(String name){
        this.name = name;
    }

    public static void printpay(IPayable[] employees){
        for (IPayable employee : employees) {
            employee.calculateFinalPay();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void printBadges();




}


