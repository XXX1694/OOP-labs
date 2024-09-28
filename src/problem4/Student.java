package problem4;

public class Student {
    private final String name;
    private int id;
    private double grade;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.grade = 0.0;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + ", Grade: " + grade + ")";
    }
}
