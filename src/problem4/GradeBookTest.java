package problem4;

import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Course course = new Course("CS101", "Object-oriented Programming and Design", 3, "None");
        GradeBook gradeBook = new GradeBook(course);

        gradeBook.displayMessage();
        System.out.println("\nPlease input grades for students:");

        // Вводим студентов и их оценки
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter grade for " + name + ": ");
            double grade = Double.parseDouble(scanner.nextLine());

            Student student = new Student(name, id);
            student.setGrade(grade);
            gradeBook.addStudent(student);
        }

        gradeBook.displayGradeReport();
        gradeBook.outputBarChart();

        scanner.close();
    }
}
