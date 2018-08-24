package professionalfindersystem;
import java.util.*;
public class login {
int i=0;
	void login()
	{
		String email,password;
		Scanner sc= new Scanner(System.in);
		System.out.println("Email-ID:");
		email=sc.nextLine();
		while((checkEmail(email))){
			System.out.println("E-mail is not registered");
			System.out.println("Email-ID:");
			email=sc.nextLine();
		}
		password=sc.nextLine();
		checkPassword(password);
		
	}
	boolean checkEmail(String email)
	{
		for(int j=0;j<i;j++)
		{
		if(email.equals(u[j].email));
		return true;
		}
		return false;
	}
	boolean checkPassword(String password)
	{
		
	}
}
