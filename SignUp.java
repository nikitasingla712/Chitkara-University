package Buddy;
import java.sql.*;
import java.util.*;
public class SignUp 
{
	public SignUp(){  	
		Scanner sc=new Scanner(System.in);
	try{  
	Class.forName("oracle.jdbc.driver.OracleDriver");  
	  
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","PROJECT","singla");  
	  
	PreparedStatement stmt=con.prepareStatement("insert into Users values(?,?,?,?,?,?,?,?,?)");
	System.out.println("First Name: ");
	String FName=sc.next();
	stmt.setString(1,FName); 
	sc.nextLine();
	System.out.println("Last Name: ");
	String LName=sc.next();
	stmt.setString(2,LName);
	System.out.println("User Id: ");
	String UID=sc.next();
	stmt.setString(3,UID);  
	System.out.println("Password: ");
	String Pwd=sc.next();
	stmt.setString(4,Pwd);
	System.out.println("Designation: ");
	String 	Ds=sc.next();
	stmt.setString(5,Ds);
	System.out.println("City: ");
	String City=sc.next();
	stmt.setString(6,City);
	System.out.println("Hint Question: ");
	String HintQ=sc.next();
	stmt.setString(7,HintQ);
	sc.nextLine();
	System.out.println("Hint Answer: ");
	String HintA=sc.next();
	stmt.setString(8,HintA);
	sc.nextLine();
	System.out.println("Phone Number: ");
	String PhoneNo=sc.next();
	stmt.setString(9,PhoneNo);
	int i=stmt.executeUpdate();
	System.out.println("SignUp Successfully");  
	con.close();  
	  System.out.println("Registration Sucess");
	  Login l=new Login();
	}catch(Exception e)
	{ 
		System.out.println("Please Enter Correct Details");
	}  
	  
	}  
}  

