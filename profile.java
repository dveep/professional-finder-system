package professionalfindersystem;

import java.util.*;


public class profile {
	String firstname, lastname, address, contactno, email, job, city, password;
	String currentPwd, newPwd;
	Scanner in= new Scanner(System.in);
	int count=0,c1=0;
	
	void resetPassword()
	{
		if(count>3){
			System.out.println("3 wrong attempts. Try again after sometime.");
			return;
		}
		System.out.println("Enter current password:");
		currentPwd = in.next();
		if(currentPwd.equals(this.password)){
			System.out.println("Enter new password: (It should contain 1 number, 1 capital, 1 special character)");
			this.password = in.next();
			return;
		}
		else{
			System.out.println("Password incorrect. Try again.");
			count++;
			
			resetPassword();
		}
	}
	void updateDetails()
	{
		if(c1>3){
			System.out.println("3 wrong attempts. Try again after sometime.");
			return;
		}
		System.out.println("Enter password:");
		currentPwd = in.next();
		if(currentPwd.equals(this.password)){
			
			System.out.println("1.First Name\t2.Last Name\t3.Contact No.\t4.Address\t5.City\t6.Job\t7.Exit");
			while(1)
			{
			int choice=in.nextInt();
			
			String s=in.nextLine();
				switch(choice)
				{
				case 1:
					this.firstname=s;
					break;
					
				case 2:
					this.lastname=s;
					break;
				
				case 3:
					this.contactno=s;
					break;
				
				case 4:
					this.address=s;
					break;
				
				case 5:
					this.city=s;
					break;
				
				case 6:
					this.job=s;
					break;
				
				case 7:
					break;
				}
			}		
		}
		else{
			System.out.println("password incorrect. Try again.");
			c1++;
			updateDetails();
		}
	}
	
}
