
import java.util.List;
import java.util.ArrayList;

public class SchoolManagementSystem {
    //assigned private to grades
    private List<String> grades = new ArrayList<>();
    //try and throw, catch and finally arguments
    public void assignGrade(String studentName, int grade) {
        try {
            if (grade < 0 || grade > 100) {
                throw new IllegalArgumentException("Invalid grade. Grade must be between 0 and 100.");
            }
            grades.add(studentName + ": " + grade);
            System.out.println("Grade assigned successfully.");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Grade assignment attempted.");
        }
    }
  //new instance
    public static void main(String[] args) {
        SchoolManagementSystem system = new SchoolManagementSystem();
        system.assignGrade("Michael", 85);
        system.assignGrade("Angela", 105);
        system.assignGrade("Beatrice", -10);
    }
}
