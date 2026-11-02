
/*
 * Name: Renyza Kaye Montes
 * Section: [Your Section]
 * Date: November 2, 2026
 */

public class Student {

    private String name;
    private String studentId;
    private String course;
    private int yearLevel;

    // Bonus: Counts the number of Student objects created
    private static int studentCount = 0;

    // Constructor
    public Student(String name, String studentId, String course, int yearLevel) {
        setName(name);
        setStudentId(studentId);
        setCourse(course);
        setYearLevel(yearLevel);

        studentCount++;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name! Name cannot be empty.");
        }
    }

    // Getter and Setter for studentId
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId != null && studentId.startsWith("STU")) {
            this.studentId = studentId;
        } else {
            System.out.println("Invalid Student ID! It must start with STU.");
        }
    }

    // Getter and Setter for course
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        if (course != null && !course.trim().isEmpty()) {
            this.course = course;
        } else {
            System.out.println("Invalid course! Course cannot be empty.");
        }
    }

    // Getter and Setter for yearLevel
    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        if (yearLevel >= 1 && yearLevel <= 4) {
            this.yearLevel = yearLevel;
        } else {
            System.out.println("Invalid year level! Must be between 1 and 4.");
        }
    }

    // Bonus: Static getter for student count
    public static int getStudentCount() {
        return studentCount;
    }

    // Display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + studentId);
        System.out.println("Course: " + course);
        System.out.println("Year Level: " + yearLevel);
    }
}
