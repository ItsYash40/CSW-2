class Employee1 {
    public double calculateSalary() {
        return 50000;  // Default salary for an employee
    }
}

class Manager extends Employee1 {
    @Override
    public double calculateSalary() {
        double baseSalary = super.calculateSalary();  // Call base class method
        double bonus = 10000;  // Manager's bonus
        return baseSalary + bonus;  // Return total salary with bonus
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        System.out.println("Employee Salary: " + emp.calculateSalary());

        Manager mgr = new Manager();
        System.out.println("Manager Salary (with bonus): " + mgr.calculateSalary());
    }
}










/* Write a java program to create a base class Employee with a method CalculateSalary()
 * hat returns a default salary . Then  create a sub class Manager, that overrides the CalculateSalary()
 * method to include a bonus in the salary calculation. Write a driver program to demonstarte  method
 * pverriding by creating  both Employee and Manager objects and calling CalculateSalary()
 methods. */
