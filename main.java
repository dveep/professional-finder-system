package professionalfindersystem;
import java.util.*;
public class main {

	public static void main(String[] args) {
		String a;
		Scanner in = new Scanner(System.in);
		System.out.println("Login or signup? (L/S)");
		a = in.nextLine();
		if(a.equalsIgnoreCase("L"))
		{
			
		}
		else{
			signup sup= new signup();
			sup.signup();
		}
	}

}
