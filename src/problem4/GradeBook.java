package problem4;

import java.util.ArrayList;
import java.util.List;

public class GradeBook {
    private final Course course;
    private final List<Student> students;

    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course);
    }

    public void displayGradeReport() {
        double total = 0.0;
        double lowestGrade = Double.MAX_VALUE;
        double highestGrade = Double.MIN_VALUE;
        String lowestStudent = "";
        String highestStudent = "";

        System.out.println("\nGrades Report:");

        for (Student student : students) {
            total += student.getGrade();
            System.out.println(student);
            if (student.getGrade() < lowestGrade) {
                lowestGrade = student.getGrade();
                lowestStudent = student.toString();
            }
            if (student.getGrade() > highestGrade) {
                highestGrade = student.getGrade();
                highestStudent = student.toString();
            }
        }

        double average = total / students.size();
        System.out.printf("Class average is %.2f. Lowest grade is %.2f (%s). Highest grade is %.2f (%s).\n",
                average, lowestGrade, lowestStudent, highestGrade, highestStudent);
    }

    public void outputBarChart() {
        int[] gradeDistribution = new int[11]; // 0-100, разбитые на 10-11 диапазонов

        for (Student student : students) {
            int grade = (int) student.getGrade();
            if (grade >= 0 && grade <= 100) {
                gradeDistribution[grade / 10]++;
            }
        }

        System.out.println("Grades distribution:");
        for (int i = 0; i < gradeDistribution.length; i++) {
            System.out.printf("%2d-%2d: ", i * 10, (i * 10) + 9);
            for (int j = 0; j < gradeDistribution[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
