package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int courseLevel;
	private String studentID;
	private String courses=null;
	private float tuitionBalance=0;
	private static int courseCost= 600;
	public static int id=1000;
	
	
	//Constructor :  Ask user to enter name and year	
	public Student() {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter student's first name: ");
		this.firstName= input.nextLine();
		
		System.out.println("Enter student's last name: ");
		this.lastName= input.nextLine();
		
		System.out.println("1- HighSchool\n2- Freshman\n3- Bacheolor\n4- Graduate\nEnter student's course level: ");
		this.courseLevel= input.nextInt();
		
		
		
		setStudentID();
		
	}
	
	
	//Generate an ID with five digits , first digit related to Grade level
	private void setStudentID() {
		id++;
		this.studentID= courseLevel+""+id;
	}
	
	//Enroll in courses
	public void enroll() {
		do{
			System.out.print("\nEnter course to enroll(Q to quit):");
			Scanner input=new Scanner(System.in);
			String course= input.nextLine();
			if(!course.equals("Q")) {
				courses=courses+ "\n "+course;
				tuitionBalance= tuitionBalance+courseCost;
			}
			else 
			{
				break;
			}
		}
		while(1 != 0);
		
	}
	
	
	//View Balance
	public void viewBalance() {
		System.out.println("Your balance is: $"+ tuitionBalance);
	}
	
	
	//pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment amount: $");
		Scanner input=new Scanner(System.in);
		float payment= input.nextFloat();
		tuitionBalance=tuitionBalance-payment;
		System.out.println("Thankyou for your payment: $"+payment);
		viewBalance();
		
	}
	
	
	//Show status of the student
	public String showInfo() {
		return "Name: "+ firstName+" "+ lastName+"\nCourse Level: "+courseLevel+"\nStudentID: "+" "+ studentID+"\nCourses Enrolled: "+ courses+"\nBalance: "+ tuitionBalance;
	}
	

}
