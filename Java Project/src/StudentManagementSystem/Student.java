package StudentManagementSystem;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses="";
	private int tuitionBalance=0;
	private static int costOfCourse = 600;
	private static int id=1000;
	
	//constructor: get name and year
	public Student() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Student's first name: ");
		firstName=scanner.nextLine();
		System.out.print("Enter Student's last name: ");
		lastName=scanner.nextLine();
		System.out.print("\n1 - First Year\n2 - Sophomore Year\n3 - Third year\nEnter Student's grade Year: ");
		gradeYear=scanner.nextInt();
		
		
		setStudentID();
		
		System.out.println("\nName: "+firstName+" "+lastName+" ID: "+ studentID+"\n");
	}
	
	//set student id
	private void  setStudentID() {
		id++;
		studentID=gradeYear+""+id;
	}
	
	//enroll course
	public void enroll() {
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner scanner = new Scanner(System.in);
			String course=scanner.nextLine();
			
			if(!course.equals("Q")) {
				courses+=" "+course;
				tuitionBalance+=costOfCourse;
			}
			else {
				break;
			}
		}while(1!=0);
		System.out.println("enrolled in:"+courses);
		System.out.println("tuition balance: "+tuitionBalance);
	}
}
