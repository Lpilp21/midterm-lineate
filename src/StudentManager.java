import java.util.HashMap;
import java.util.Map;

public class StudentManager {
    private Map<Integer, Student> students;

    public StudentManager() {
        students = new HashMap<>();
    }

    public void addStudent(Student student) {
        if (students.containsKey(student.getId())) {
            System.out.println("Student with ID " + student.getId() + " already exists.");
        } else {
            students.put(student.getId(), student);
            System.out.println("Student with ID " + student.getId() + " has been added.");
        }
    }

    public void deleteStudent(int studentId) {
        if (students.containsKey(studentId)) {
            students.remove(studentId);
            System.out.println("Student with ID " + studentId + " has been deleted.");
        } else {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }

    public void updateStudent(Student student) {
        if (students.containsKey(student.getId())) {
            students.put(student.getId(), student);
            System.out.println("Student with ID " + student.getId() + " has been updated.");
        } else {
            System.out.println("Student with ID " + student.getId() + " not found.");
        }
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("List of students:");
            for (Student student : students.values()) {
                System.out.println(student);
            }
        }
    }

    public Student findStudentById(int studentId) {
        return students.get(studentId);
    }
}
