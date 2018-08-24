package professionalfindersystem;

import java.util.*;

public class client {
	
	int rating; 
	String review,email, password, firstname, lastname, address, contactno, city;
	client(String email,String password,String firstname,String lastname,String address,String contactno,String city)
	{
		this.email=email;
		this.password=password;
		this.firstname=firstname;
		this.lastname=lastname;
		this.address=address;
		this.contactno=contactno;
		this.city=city;
	}
	
	Scanner in = new Scanner(System.in);
	void search(){
		String s=in.nextLine();
		//database*********************************
	}
	void booking(){
		
	}
	
	void registration(){
	      	signup ss= new signup();
	      	ss.signup();
	}
	void giveFeedback(){
		
		System.out.println("Rating out of 5: ");
		this.rating = in.nextInt();
		System.out.println("Wrtie a review: ");
		this.review = in.next();
	}
}
