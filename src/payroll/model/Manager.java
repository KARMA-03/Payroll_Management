package payroll.model;

/*
Kayvian Johnson 2401010516
Tassheca Mullings 2401010139
Oneil Mullings 2301011592
Shavoy Brown 2401010961
Kyle Whitbly 2401010579
*/
// This class represents a Manager and inherits from StaffMember.

public class Manager extends StaffMember {

    // Bonus is private because it is only used inside the Manager class.
    private double bonus;

    // Constructor for creating a Manager object.
    public Manager(String name, String employeeId, int hoursWorked, double bonus) {
        super(name, employeeId, hoursWorked);
        this.bonus = bonus;
    }

    // This method calculates the manager's salary using the required formula.
    @Override
    public double calculateSalary() {
        return (hoursWorked * 2500) + bonus;
    }

    // This method overrides the parent display method to include the manager's bonus.
    @Override
    public void display() {
        super.display();
        System.out.println("Position: Manager");
        System.out.println("Bonus: $" + bonus);
        System.out.println("Final Salary: $" + calculateSalary());
        System.out.println("-----------------------------------");
    }
}
