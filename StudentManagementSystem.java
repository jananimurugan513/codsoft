import java.util.*;

class Student {
    String name;
    int rollNumber;
    String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade;
    }
}

public class StudentManagementSystem {
    static List<Student> studentList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Search Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = getIntInput();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> editStudent();
                case 3 -> removeStudent();
                case 4 -> searchStudent();
                case 5 -> displayStudents();
                case 6 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }

    static void addStudent() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int roll = getIntInput();
        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();

        if (name.isEmpty() || grade.isEmpty()) {
            System.out.println("Name and Grade cannot be empty!");
            return;
        }

        studentList.add(new Student(name, roll, grade));
        System.out.println("Student added successfully!");
    }

    static void editStudent() {
        System.out.print("Enter Roll Number to edit: ");
        int roll = getIntInput();
        for (Student s : studentList) {
            if (s.rollNumber == roll) {
                System.out.print("Enter New Name: ");
                s.name = sc.nextLine();
                System.out.print("Enter New Grade: ");
                s.grade = sc.nextLine();
                System.out.println("Student updated.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    static void removeStudent() {
        System.out.print("Enter Roll Number to remove: ");
        int roll = getIntInput();
        boolean removed = studentList.removeIf(s -> s.rollNumber == roll);
        if (removed) {
            System.out.println("Student removed.");
        } else {
            System.out.println("Student not found.");
        }
    }

    static void searchStudent() {
        System.out.print("Enter Roll Number to search: ");
        int roll = getIntInput();
        for (Student s : studentList) {
            if (s.rollNumber == roll) {
                System.out.println("Student Found: " + s);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    static void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("--- Student List ---");
            for (Student s : studentList) {
                System.out.println(s);
            }
        }
    }

    static int getIntInput() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid number. Please enter again: ");
            }
        }
    }
}
