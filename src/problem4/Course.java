package problem4;

public class Course {
    private final String name;
    private final String description;
    private final int credits;
    private final String prerequisites;

    public Course(String name, String description, int credits, String prerequisites) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    @Override
    public String toString() {
        return "lab4.Course: " + name + ", Description: " + description + ", Credits: " + credits + ", Prerequisites: " + prerequisites;
    }
}
