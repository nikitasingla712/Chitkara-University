package Buddy;
import java.util.*;
import java.sql.*;
public class NearBy 
{
	public NearBy(String City)
	{
		super();
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("What are you looking for ?");
		String type=sc.next();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","PROJECT","singla");   
			Statement stmt=con.createStatement(); 
			ResultSet rs=stmt.executeQuery("select Name,Address,PNo,Email,Rating from "+City+" where Category='"+type+"'");
			while(rs.next())
			{ 
				count++;
				System.out.println(count+". "+(rs.getString(1))+" "+(rs.getString(2))+" "+(rs.getString(3))+" ");
					System.out.println((rs.getString(4))+" "+(rs.getString(5)));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
