
import java.util.Arrays;
import java.util.Comparator;

class Student {
    int id;
    String name;
    int[] marks;

    Student(int id, String name, int[] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    int getTotal() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    double getPercentage() {
        return (double) getTotal() / marks.length;
    }

    String getGrade() {
        double percentage = getPercentage();

        if (percentage >= 90) return "A+";
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        return "D";
    }

    void display() {
        System.out.println("\nID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.println("Total: " + getTotal());
        System.out.printf("Percentage: %.2f%%%n", getPercentage());
        System.out.println("Grade: " + getGrade());
    }
}

public class Main {
    public static void main(String[] args) {

        Student[] students = {
            new Student(101, "Shikha", new int[]{85, 92, 78, 88, 90}),
            new Student(102, "Rahul", new int[]{65, 72, 68, 80, 75}),
            new Student(103, "Priya", new int[]{95, 98, 92, 96, 94}),
            new Student(104, "Aman", new int[]{55, 62, 58, 70, 66})
        };

        // Display all students
        System.out.println("===== STUDENT REPORTS =====");

        for (Student student : students) {
            student.display();
        }

        // Find topper
        Student topper = students[0];

        for (Student student : students) {
            if (student.getPercentage() >
                topper.getPercentage()) {
                topper = student;
            }
        }

        System.out.println("\n===== CLASS TOPPER =====");
        System.out.println("Name: " + topper.name);
        System.out.printf("Percentage: %.2f%%%n",
                          topper.getPercentage());

        // Sort students by percentage
        Arrays.sort(students,
            Comparator.comparingDouble(
                Student::getPercentage
            ).reversed()
        );

        System.out.println("\n===== RANKING =====");

        for (int i = 0; i < students.length; i++) {
            System.out.println(
                (i + 1) + ". " +
                students[i].name + " - " +
                students[i].getPercentage() + "%"
            );
        }
    }
}
