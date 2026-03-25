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
			System.out.println("\n 3. Exit");
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
				System.out.println("Exiting....");
				break;
				
			default:
				System.out.println("invalied choice!");
		}
		
	}while(choice != 3);

}
}
