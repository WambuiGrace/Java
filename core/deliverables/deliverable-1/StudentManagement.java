import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    ArrayList<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        StudentManagement system = new StudentManagement();
        boolean records = true;

        while (records) {
            System.out.println("Student Management System");
            System.out.println("1. Add a student");
            System.out.println("2. View all students");
            System.out.println("3. Search for a student");
            System.out.println("4. Delete a student");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    system.addStudent();
                    break;
                case 2:
                    system.viewAllStudents();
                    break;
                case 3:
                    system.searchID();
                    break;
                case 4:
                    system.deleteStudent();
                    break;
                case 5:
                    records = false;
                    break;
                default:
                    System.out.println("Invalid choice! Try again");
                    break;
            }
        }
        System.out.println("Program exited!");
        scanner.close();

    }
        //Add Student
    private void addStudent(){
        System.out.print("Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Student name: ");
        String name = scanner.nextLine();

        System.out.print("Student course: ");
        String course = scanner.nextLine();

        System.out.print("Student age: ");
        int age = scanner.nextInt();

        Student student = new Student(id, name, course, age);
        students.add(student);

        System.out.println("Student added successfully!");
    }

    //View all students
    private void viewAllStudents(){
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }
        System.out.println("\n List of students");
        for (Student student : students){
            System.out.println(student);
        }
    }

    //Search by ID
    private void searchID(){
        System.out.print("Enter StudentID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;
        for (Student student : students){
            if (student.getId() == id) {
                System.out.println(student);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID" +id+ "not found");
        }
    }

    //Delete student using lambda condition
    private void deleteStudent(){
        System.out.print("Enter student ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        boolean removed = students.removeIf(student -> student.getId() == id);

        if (removed) {
            System.out.println("Student "+id+ "removed" );
        }else{
            System.out.println("Student id " +id+ "not found");
        }
    }

}