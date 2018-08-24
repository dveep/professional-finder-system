package professionalfindersystem;

import java.util.*;


public class signup {
	String email, password, firstname, lastname, address, contactno, job, city, userType;
	Scanner in = new Scanner(System.in);
	client[] u= new client[20];
	int i=0;
	void signup(){
		System.out.println("Are you a client or a professional?(C/P)");
		userType=in.nextLine();
		System.out.println("First Name:");
		firstname=in.nextLine();
		System.out.println("Last Name:");
		lastname=in.nextLine();
		System.out.println("Email-ID:");
		email=in.nextLine();
		while((duplicateEmail(email))){
			System.out.println("E-mail is already registered");
			System.out.println("Email-ID:");
			email=in.nextLine();
		}
		System.out.println("Address:");
		address=in.nextLine();
		System.out.println("City:");
		city=in.nextLine();
		System.out.println("Contact No.:");
		contactno=in.nextLine();
		System.out.println("password:");
		password=in.nextLine();
		System.out.println("Confirm password:");
		String temp;
		temp= in.nextLine();
		while(!(temp.equals(password))){
			System.out.println("Password did not match");
			System.out.println("Confirm password:");
			temp= in.nextLine();
		}
		if(userType.equalsIgnoreCase("C"))
		{
			u[i] =new client(email, password, firstname, lastname, address, contactno, city);
			i++;
			
		}
		else
		{
			
		}
	}
	boolean duplicateEmail(String email)
	{
		for(int j=0;j<i;j++)
		{
		if(email.equals(u[j].email));
		return true;
		}
		return false;
	}
	void checkpassword()
	{
		
	}
	
}

