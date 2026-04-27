package payroll.main;

// Name: Your Name
// Student ID: Your Student ID
// This class represents a Sales Representative and inherits from StaffMember.

public class SalesRep extends StaffMember {

    // Allowance is private because only the SalesRep class needs to use it directly.
    private double allowance;

    // Constructor for creating a Sales Representative object.
    public SalesRep(String name, String employeeId, int hoursWorked, double allowance) {
        super(name, employeeId, hoursWorked);
        this.allowance = allowance;
    }

    // This method calculates the sales representative's salary using the required formula.
    @Override
    public double calculateSalary() {
        return (hoursWorked * 1500) + allowance;
    }

    // This method overrides the parent display method to include the allowance.
    @Override
    public void display() {
        super.display();
        System.out.println("Position: Sales Representative");
        System.out.println("Allowance: $" + allowance);
        System.out.println("Final Salary: $" + calculateSalary());
        System.out.println("-----------------------------------");
    }
}
