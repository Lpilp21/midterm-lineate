import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentManager studentManager = new StudentManager();

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            displayMenu();
            String choice = getUserChoice();
            switch (choice) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    deleteStudent();
                    break;
                case "3":
                    updateStudent();
                    break;
                case "4":
                    displayAllStudents();
                    break;
                case "5":
                    findStudent();
                    break;
                case "6":
                    running = false;
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("Student Management System Menu:");
        System.out.println("1. Add a Student");
        System.out.println("2. Delete a Student");
        System.out.println("3. Update a Student's Information");
        System.out.println("4. Display all Students");
        System.out.println("5. Find a Student");
        System.out.println("6. Exit");
    }

    private static String getUserChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextLine();
    }

    private static void addStudent() {
        System.out.println("Enter student details:");
        System.out.print("Student ID: ");
        int studentId = Integer.parseInt(scanner.nextLine());
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Age: ");
        byte age = Byte.parseByte(scanner.nextLine());
        System.out.print("Course: ");
        String course = scanner.nextLine();

        Student student = new Student(studentId, firstName, lastName, age, course);
        studentManager.addStudent(student);
    }

    private static void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        int studentId = Integer.parseInt(scanner.nextLine());
        studentManager.deleteStudent(studentId);
    }

    private static void updateStudent() {
        System.out.print("Enter student ID to update: ");
        int studentId = Integer.parseInt(scanner.nextLine());

        Student existingStudent = studentManager.findStudentById(studentId);
        if (existingStudent != null) {
            System.out.println("Enter new student details:");
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Age: ");
            byte age = Byte.parseByte(scanner.nextLine());
            System.out.print("Course: ");
            String course = scanner.nextLine();

            Student updatedStudent = new Student(studentId, firstName, lastName, age, course);
            studentManager.updateStudent(updatedStudent);
        } else {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }

    private static void displayAllStudents() {
        studentManager.displayAllStudents();
    }

    private static void findStudent() {
        System.out.print("Enter student ID to find: ");
        int studentId = Integer.parseInt(scanner.nextLine());

        Student student = studentManager.findStudentById(studentId);
        if (student != null) {
            System.out.println("Student details:");
            System.out.println(student);
        } else {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }
}