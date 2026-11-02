
/*
 * Name: Renyza Kaye Montes
 * Section: [Your Section]
 * Date: November 3, 2026
 */

public class Employee {

    private String name;
    private String employeeId;
    private String department;
    private double monthlySalary;

    // Constructor
    public Employee(String name, String employeeId,
                    String department, double monthlySalary) {

        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        setMonthlySalary(monthlySalary);
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for employeeId
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    // Getter and Setter for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Getter and Setter for monthlySalary
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            System.out.println("Invalid salary! Salary must be greater than 0.");
        }
    }

    // Bonus: Calculate annual salary
    public double getAnnualSalary() {
        return monthlySalary * 12;
    }

    // Display employee information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Monthly Salary: " + monthlySalary);
    }
}
