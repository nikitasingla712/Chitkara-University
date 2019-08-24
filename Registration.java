package Buddy;
import java.sql.*;
import java.util.*;
public class Registration 
{
	public Registration()
	{
		Scanner sc=new Scanner(System.in);
		String City=sc.next();
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","PROJECT","singla");  
			  
			PreparedStatement stmt=con.prepareStatement("insert into "+City+"  values(?,?,?,?,?,?)");
			System.out.println("Enter Name of your Occupation: ");
			String Name=sc.next();
			sc.nextLine();
			stmt.setString(1,Name);
			System.out.println("Enter Address:");
			String Address=sc.next();
			sc.nextLine();
			stmt.setString(2,Address);
			System.out.println("Enter Contact Number:");
			String PNo=sc.next();
			stmt.setString(3,PNo);
			System.out.println("Enter EmailId:");
			String email=sc.next();
			stmt.setString(4,email);
			System.out.println("Enter Category:");
			String type=sc.next();
			sc.nextLine();
			stmt.setString(5,type);
			System.out.println("Rating:");
			String Rating=sc.next();
			sc.nextLine();
			stmt.setString(6,Rating);
			int i=stmt.executeUpdate();
			System.out.println(i+" records inserted");  
			con.close();  
			  System.out.println("Registration Sucess");
		}
		catch(Exception e)
		{
			System.out.println("Register Your City First");
			RegisterCity rc=new RegisterCity();
		}
	}
}
