
/*
 * Name: Renyza Kaye Montes
 * Section: [Your Section]
 * Date: November 2, 2026
 */

public class CollegeStudent extends Student {

    private String scholarshipStatus;

    // Constructor
    public CollegeStudent(String name, String studentId, String course,
                          int yearLevel, String scholarshipStatus) {

        super(name, studentId, course, yearLevel);

        setScholarshipStatus(scholarshipStatus);
    }

    // Getter
    public String getScholarshipStatus() {
        return scholarshipStatus;
    }

    // Setter
    public void setScholarshipStatus(String scholarshipStatus) {
        if (scholarshipStatus != null && !scholarshipStatus.trim().isEmpty()) {
            this.scholarshipStatus = scholarshipStatus;
        } else {
            System.out.println("Invalid scholarship status!");
        }
    }

    // Method Overriding
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Scholarship: " + scholarshipStatus);
    }
}
