
/*
 * Name: Renyza Kaye Montes
 * Section: [Your Section]
 * Date: November 3, 2026
 */

public class Manager extends Employee {

    private int teamSize;

    // Constructor
    public Manager(String name, String employeeId,
                   String department, double monthlySalary,
                   int teamSize) {

        super(name, employeeId, department, monthlySalary);

        setTeamSize(teamSize);
    }

    // Getter for teamSize
    public int getTeamSize() {
        return teamSize;
    }

    // Setter for teamSize
    public void setTeamSize(int teamSize) {
        if (teamSize >= 0) {
            this.teamSize = teamSize;
        } else {
            System.out.println("Invalid team size! Cannot be negative.");
        }
    }

    // Method Overriding
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Team Size: " + teamSize);
    }
}
