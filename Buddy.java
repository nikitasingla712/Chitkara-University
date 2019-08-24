package Buddy;
import java.util.*;
import java.sql.*;
public class Buddy 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for SignUp");
		System.out.println("Press 2 for login");
		System.out.println("Press 3 for registeration of  city");
		System.out.println("Press 4 to close the application");
		int Choice=sc.nextInt();
		switch(Choice)
		{
			case 1:
				System.out.println("SignUp Please");
				SignUp s=new SignUp();
				break;
			case 2:
				System.out.println("Login Now");
				Login l=new Login();
				break;
			case 3:
				System.out.println("Register your City in Buddy");
				RegisterCity rc=new RegisterCity();
				Buddy b=new Buddy();
				break;
			case 4:
				break;
			default:
				System.out.println("Wrong Input");
				System.out.println("Enter Correct Input");
				Buddy b1=new Buddy();
				break;
		}
	}
}
