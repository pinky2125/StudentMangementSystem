import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    int id = 0;

                    try {
                        System.out.print("Enter ID: ");
                        id = sc.nextInt();
                    } catch (Exception e) {
                        System.out.println("Invalid input! Enter number only");
                        sc.nextLine();
                        break;
                    }

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    if(marks < 0 || marks > 100) {
                        System.out.println("Invalid marks! Marks should be between 0 and 100.");
                        break;
                    }

                    // 🔥 Duplicate ID check
                    boolean exists = false;
                    for(Student st : list) {
                        if(st.getId() == id) {
                            exists = true;
                            break;
                        }
                    }

                    if(exists) {
                        System.out.println("ID already exists!");
                    } else {
                        Student s = new Student(id, name, marks); // 🔥 constructor use
                        list.add(s);
                        System.out.println("Student Added!");
                    }
                    break;

                case 2:
                    if(list.isEmpty()) {
                        System.out.println("No students found!");
                    } else {
                        for(Student st : list) {
                            System.out.println(st.getId() + " " + st.getName() + " " + st.getMarks());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();

                    boolean found = false;

                    for(Student st : list) {
                        if(st.getId() == updateId) {

                            sc.nextLine();

                            System.out.print("Enter new name: ");
                            st.setName(sc.nextLine());

                            System.out.print("Enter new marks: ");
                            st.setMarks(sc.nextInt());

                            System.out.println("Student updated!");
                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();

                    boolean removed = false;

                    for(int i = 0; i < list.size(); i++) {
                        if(list.get(i).getId() == deleteId) {
                            list.remove(i);
                            System.out.println("Student deleted!");
                            removed = true;
                            break;
                        }
                    }

                    if(!removed) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while(choice != 5);
    }
}