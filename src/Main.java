import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do {
			System.out.println("\n 1. Add Student");
			System.out.println("\n 2. View Student");
			System.out.println("\n 3. Update Student");
			System.out.println("\n 4. Delete Student");
			System.out.println("\n 5. Exit");
			System.out.println("Enter choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("Enter ID: ");
				int id = sc.nextInt();
				
				sc.nextLine();
				
				System.out.print("Enter Name: ");
                String name = sc.nextLine();
                
                System.out.print("Enter Marks: ");
                int marks = sc.nextInt();
                
                Student s = new Student();
                s.id = id;
                s.name = name;
                s.marks = marks;
                
                list.add(s);
                System.out.println("Student Added!");
                break;
                
			case 2:
				 if(list.isEmpty()) {
                     System.out.println("No students found!");
				 }else {
					 for(Student st : list) {
						 System.out.println(st.id +" "+st.name +" "+st.marks);
					 }
				 }
				 break;
			case 3:
				System.out.print("Enter ID to update: ");
			    int updateId = sc.nextInt();

			    boolean found = false;

			    for(Student st : list) {
			        if(st.id == updateId) {

			            sc.nextLine(); // buffer

			            System.out.print("Enter new name: ");
			            st.name = sc.nextLine();

			            System.out.print("Enter new marks: ");
			            st.marks = sc.nextInt();

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
			        if(list.get(i).id == deleteId) {
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
				System.out.println("invalied choice!");
		}
		
	}while(choice != 5);

	}
}
