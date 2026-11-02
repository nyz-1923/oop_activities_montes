
/*
 * Name: Renyza Kaye Montes
 * Section: [Your Section]
 * Date: November 3, 2026
 */

public class Main {

    public static void main(String[] args) {

        // Create Employee objects
        Employee emp1 = new Employee(
                "Juan Dela Cruz", "EMP001", "IT", 25000.0
        );

        Employee emp2 = new Employee(
                "Maria Lopez", "EMP002", "HR", 22000.0
        );

        // Create Manager object
        Manager emp3 = new Manager(
                "Carlo Mendoza", "EMP003", "IT", 45000.0, 8
        );

        // Bonus: Store employees in an array
        Employee[] employees = {emp1, emp2, emp3};

        // Display all employee information using a loop
        System.out.println("===== EMPLOYEE INFORMATION =====");

        for (Employee employee : employees) {

            if (employee instanceof Manager) {
                System.out.println("\n===== MANAGER =====");
            }

            employee.displayInfo();

            // Bonus: Display annual salary
            System.out.println("Annual Salary: "
                    + employee.getAnnualSalary());

            System.out.println();
        }

        // Update employee salary
        System.out.println("===== UPDATED INFORMATION =====");

        emp2.setMonthlySalary(24000.0);

        System.out.println("Name: " + emp2.getName());
        System.out.println("Monthly Salary: "
                + emp2.getMonthlySalary());
        System.out.println("Annual Salary: "
                + emp2.getAnnualSalary());

        // Bonus: Test invalid team size
        System.out.println("\n===== VALIDATION TEST =====");

        emp3.setTeamSize(-5);

        System.out.println("Manager: " + emp3.getName());
        System.out.println("Team Size: " + emp3.getTeamSize());
    }
}

/*
 * REFLECTION QUESTIONS
 *
 * 1. Why should monthlySalary be private, and what does the setter protect against?
 * Answer: Dapat private ang monthly salary para ma protect ang employee's
 * information. The setter prevents zero or negative salary values.
 *
 * 2. Is a Manager also an Employee? Explain using the word extends.
 * Answer: Yes po, ang Manager is also an Employee kay ang Manager
 * class extends the Employee class and inherits its attributes and methods.
 *
 * 3. What is the advantage of calling super.displayInfo() inside
 * Manager's displayInfo()?
 * Answer: e allow ang Manager class na e reuse ang displayInfo()
 * method of Employee and ma add ang team size nga dili na need e repeat ang code.
 */
