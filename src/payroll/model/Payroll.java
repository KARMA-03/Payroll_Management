package payroll.model;

/*
Kayvian Johnson 2401010516
Tassheca Mullings 2401010139
Oneil Mullings 2301011592
Shavoy Brown 2401010961
Kyle Whitbly 2401010579
*/
// This is the main class that runs the payroll system.

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class Payroll {

    public static void main(String[] args) {

        // This Manager object is used to demonstrate polymorphism.
        StaffMember manager = new Manager("Alicia Brown", "M001", 40, 20000);

        // A parent class reference is being used to call the display method.
        // This shows polymorphism because Java decides which display method to use at runtime.
        System.out.println("MANAGER DETAILS");
        manager.display();

        // This ArrayList stores exactly five Sales Representative objects.
        ArrayList<SalesRep> salesReps = new ArrayList<>();

        salesReps.add(new SalesRep("Daniel Smith", "S001", 38, 5000));
        salesReps.add(new SalesRep("Keisha Grant", "S002", 40, 6500));
        salesReps.add(new SalesRep("Michael Johnson", "S003", 35, 4500));
        salesReps.add(new SalesRep("Tanya Williams", "S004", 42, 7000));
        salesReps.add(new SalesRep("Andre Campbell", "S005", 39, 5500));

        System.out.println("SALES REPRESENTATIVE DETAILS");

        // This loop goes through each SalesRep object and displays the payroll details.
        for (SalesRep rep : salesReps) {
            rep.display();
        }

        // This section writes the payroll information to a text file named Paystubs.txt.
        try {
            FileWriter writer = new FileWriter("Paystubs.txt");

            writer.write("PAYROLL PAYSTUBS\n");
            writer.write("==============================\n\n");

            writer.write("Manager Paystub\n");
            writer.write("Name: " + manager.name + "\n");
            writer.write("Employee ID: " + manager.employeeId + "\n");
            writer.write("Final Salary: $" + manager.calculateSalary() + "\n\n");

            writer.write("Sales Representative Paystubs\n");
            writer.write("==============================\n");

            // This loop writes each sales representative's paystub to the file.
            for (SalesRep rep : salesReps) {
                writer.write("Name: " + rep.name + "\n");
                writer.write("Employee ID: " + rep.employeeId + "\n");
                writer.write("Final Salary: $" + rep.calculateSalary() + "\n");
                writer.write("------------------------------\n");
            }

            writer.close();

            System.out.println("Paystubs.txt was created successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while creating the paystub file.");
            e.printStackTrace();
        }
    }
}