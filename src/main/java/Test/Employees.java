package Test;

public class Employees extends Person {
    private int ID = 1;
    private double uniqueID = ++ID;





    public Employees(String name) {
        super(name);
    }
        public void printBadges() {
            System.out.println("Welcome! " + getName());
            System.out.println("EmployeeID :" + this.uniqueID);
        }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getUniqueID() {
        return (int) uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }
}
