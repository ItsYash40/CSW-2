// Base class Employee
class Employee1 {
    // Default salary for an employee
    public double calculateSalary() {
        return 50000;  // Default salary for an employee
    }
}

// Subclass Manager that overrides calculateSalary method
class Manager extends Employee1 {
    // Override the calculateSalary method to include a bonus
    @Override
    public double calculateSalary() {
        double baseSalary = super.calculateSalary();  // Call base class method
        double bonus = 10000;  // Manager's bonus
        return baseSalary + bonus;  // Return total salary with bonus
    }
}

// Driver class to demonstrate method overriding
public class EmployeeSalary {
    public static void main(String[] args) {
        // Create an Employee object and calculate salary
        Employee1 emp = new Employee1();
        System.out.println("Employee Salary: " + emp.calculateSalary());

        // Create a Manager object and calculate salary
        Manager mgr = new Manager();
        System.out.println("Manager Salary (with bonus): " + mgr.calculateSalary());
    }
}










/* Write a java program to create a base class Employee with a method CalculateSalary()
 * hat returns a default salary . Then  create a sub class Manager, that overrides the CalculateSalary()
 * method to include a bonus in the salary calculation. Write a driver program to demonstarte  method
 * pverriding by creating  both Employee and Manager objects and calling CalculateSalary()
 methods. */
