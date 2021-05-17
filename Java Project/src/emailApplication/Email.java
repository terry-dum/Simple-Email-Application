package emailApplication;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private String email;
	private String companySuffix=".aloha.com";
	private int defaultPasswordLength=10;
	private int mailboxCapacity=500;
	
	//constructor to receive name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Hi "+this.firstName+" "+this.lastName);
		
		//call setDepartment method to set the department
		department = setDepartment();
		System.out.println("Your department is "+department);
		
		//call setPassword method to set the password
		password=setPassword(defaultPasswordLength);
		System.out.println("Your password is "+password);
		
		//Email generation
		email = this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+department+companySuffix;
		System.out.println("Your email is " + email);
	}
	
	//setDepartment
	private String setDepartment() {
		System.out.println("What is your department code?\n1 Sales\n2 Development\n3 Accounting\n");
		Scanner scanner=new Scanner(System.in);
		int depChoice = scanner.nextInt();
		
		switch(depChoice) {
		case 1: return "sal";
		case 2: return "dev";
		case 3: return "acc";
		default: return "invalid.";
		}
	}
	
	//setpassword
	private String setPassword(int length) {
		String passwordSet="QWERTYUIOPASDFGHJKLMNBVCXZqazwsxedcrfvtgbyhnujmikolp1234567890.!@#$*";
		char password[] = new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int) (Math.random() * (passwordSet.length()));
			password[i]=passwordSet.charAt(rand);
		}
		
		return new String(password);
	}
	
	//set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		mailboxCapacity=capacity;
	}
	
	//set alternative email
	public void setAlternateEmail(String email) {
		alternateEmail=email;
	}
	
	//change password
	public void setPassword(String password) {
		this.password=password;
	}
	
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	public void showInfo() {
		System.out.println("Department: "+department);
		System.out.println("Password: " + password);
		System.out.println("Email: " + email);
	}
}
