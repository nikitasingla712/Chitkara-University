package Buddy;
import java.sql.*;
import java.util.*;
public class AreaInfo 
{
	public AreaInfo(String City)
	{
		super();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for PinCode of Your City");
		System.out.println("Press 2 for PinCode of Specific City");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		try
		{   
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","PROJECT","singla");   
			Statement stmt=con.createStatement(); 
			ResultSet rs=stmt.executeQuery("select pincode from Area where city ='"+City+"'");
			while(rs.next())
			{ 
				System.out.print("Pincode for '"+City+"'"+" ");
				System.out.println((rs.getString(1)));
			}
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}  
		break;
		case 2:
			String City1=sc.next();
			try
			{   
				Class.forName("oracle.jdbc.driver.OracleDriver");  
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","PROJECT","singla");   
				Statement stmt=con.createStatement(); 
				ResultSet rs=stmt.executeQuery("select pincode from Area where city ='"+City1+"'");
				while(rs.next())
				{ 
					System.out.print("Pincode for '"+City1+"'"+" ");
					System.out.println((rs.getString(1)));
				}
			}
			catch(Exception e)
			{ 
				System.out.println("Enter Correct Details");
				RegisterCity rc=new RegisterCity();
			} 
			break;
			default:
				System.out.println("Press Correct Option");
				AreaInfo af=new AreaInfo(City);
				break;
		}
	}
}
