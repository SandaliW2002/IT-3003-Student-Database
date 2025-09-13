import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();
        int choice;

        do {
            System.out.println("\n--- Student Database App ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    dao.addStudent(new Student(name, age, email));
                }
                case 2 -> {
                    List<Student> students = dao.getAllStudents();
                    System.out.println("\nID | Name | Age | Email");
                    for (Student s : students) {
                        System.out.println(s);
                    }
                }
                case 3 -> {
                    System.out.print("Enter student ID to update: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter new age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new email: ");
                    String email = sc.nextLine();
                    dao.updateStudent(new Student(id, name, age, email));
                }
                case 4 -> {
                    System.out.print("Enter student ID to delete: ");
                    int id = sc.nextInt();
                    dao.deleteStudent(id);
                }
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
