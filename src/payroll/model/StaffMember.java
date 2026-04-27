package payroll.main;

// Name: Your Name
// Student ID: Your Student ID
// This class represents a general staff member in the company.
// It is abstract because every staff member must calculate salary differently.

public abstract class StaffMember {

    // These are protected because subclasses like Manager and SalesRep need access to them.
    protected String name;
    protected String employeeId;
    protected int hoursWorked;

    // Constructor used to set the basic information for every staff member.
    public StaffMember(String name, String employeeId, int hoursWorked) {
        this.name = name;
        this.employeeId = employeeId;
        this.hoursWorked = hoursWorked;
    }

    // This method displays the general details that all staff members share.
    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Hours Worked: " + hoursWorked);
    }

    // This abstract method forces each subclass to create its own salary calculation.
    public abstract double calculateSalary();
}