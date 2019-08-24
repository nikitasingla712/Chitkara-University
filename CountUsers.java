package Buddy;
import java.util.*;
import java.sql.*;
public class CountUsers 
{
	public CountUsers(String City)
	{
		super();
		int count=0;
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","PROJECT","singla");   
			Statement stmt=con.createStatement(); 
			ResultSet rs=stmt.executeQuery("select count(City) from Users where city ='"+City+"'");
			while(rs.next())
			{ 
				System.out.print("Number of Users in '"+City+"'"+" are ");
				System.out.println((rs.getString(1)));
			}
			ResultSet rs1=stmt.executeQuery("select * from users where City ='"+City+"'");
			while(rs1.next()) 
			{
				count++;
				System.out.println(count+". Full Name: "+rs1.getString(1)+" "+rs1.getString(2)+"\nPhone Number: "+rs1.getString(9));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
