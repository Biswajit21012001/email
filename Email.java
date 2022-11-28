package emailapp;

import java.util.Scanner;

public class Email {

	private String firstname;
	private String lastname;
	private int  defaultPasswordLength=10;
	private String department;
	private int mailboxCapacity;
	private String Email;
	private Object password;
	private String companySuffix="google.com";
	
	
	//construct to receive the first name and last name
	public Email(String firstname,String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
		System.out.println("Email created:"+this.firstname+this.lastname);  
	//call for a department  -return the department
		this.department=setDepartment();
		System.out.println("Department:"+this.department);
	// call a method that generate random password
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("your pasword is:"+this.password);
   //combine elements to generate email
		Email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+ companySuffix;
		System.out.println("Your Email is"+Email);
		
	}
	//ask for department
	private String setDepartment() {
		System.out.println("Department Code\n1 for sales\n2 for Developer\n3 for Accounting\n0 for none\nenter department code:");
		Scanner sc=new Scanner(System.in);
		int DepChoice=sc.nextInt();
		if(DepChoice==1) {
			return"sales";
		}
		else if(DepChoice==2){
			return "Developer";
		}
		else if(DepChoice==3) {
			return "Accounting";
		}
		else {
			return "";
		}
	
		
	}
	
	//create a random password
	private String randomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random() * passwordSet.length());
			password[i]=passwordSet.charAt(rand);
			
		}
		return new String(password);
		}
     
	

	
	//change the password
	
	
	
}
