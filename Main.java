
/*
 * Name: Renyza Kaye Montes
 * Section: [Your Section]
 * Date: November 2, 2026
 */

public class Main {

    public static void main(String[] args) {

        // Create Student objects
        Student student1 = new Student("Ana Cruz", "STU001", "BSIT", 2);

        Student student2 = new Student("Mark Reyes", "STU002", "BSCS", 1);

        // Create CollegeStudent object
        CollegeStudent student3 = new CollegeStudent(
                "Lea Santos", "STU003", "BSIT", 3, "Full Scholar"
        );

        // Store all students in an array (Bonus)
        Student[] students = {student1, student2, student3};

        // Display Student Information
        System.out.println("===== STUDENT INFORMATION =====");

        for (int i = 0; i < students.length; i++) {
            if (i < 2) {
                students[i].displayInfo();
                System.out.println();
            }
        }

        // Display College Student
        System.out.println("===== COLLEGE STUDENT =====");
        student3.displayInfo();

        // Update student information
        System.out.println("\n===== UPDATED INFORMATION =====");

        student1.setYearLevel(4);

        System.out.println("Name: " + student1.getName());
        System.out.println("Course: " + student1.getCourse());
        System.out.println("Year Level: " + student1.getYearLevel());

        // Bonus: Test invalid update
        System.out.println("\n===== VALIDATION TEST =====");

        student1.setYearLevel(5);
        student1.setStudentId("ABC001");

        // Display total number of students
        System.out.println("\nTotal Student Objects Created: "
                + Student.getStudentCount());
    }
}

/*
 * REFLECTION QUESTIONS
 *
 * 1. Why should the attributes of Student be private instead of public?
 * Answer: Attributes should be private to protect the data and allow
 * access only through getters and setters.
 *
 * 2. What would happen if CollegeStudent did not call super(...) in its constructor?
 * Answer: Java would try to call the default parent constructor.
 * Since Student has no default constructor, it would cause an error.
 *
 * 3. What is the benefit of overriding displayInfo() instead of writing
 * a new method with a different name?
 * Answer: Overriding allows the child class to reuse the parent's method
 * and add its own information without creating a separate method.
 */
