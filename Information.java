package Buddy;
import java.util.*;
import java.sql.*;
public class Information 
{
	public Information(String userId,String password,String City)
	{
		super();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for AreaPinCode");
		System.out.println("Press 2 to check users in your Area");
		System.out.println("Press 3 to search nearby");
		System.out.println("Press 4 to Play a Quiz Game");
		System.out.println("Press 5 for Setting");
		System.out.println("Press 6 for registeration of your Occupation");
		System.out.println("Press 7 for Logout");
		int choice=sc.nextInt();
		boolean Flag1=false;
		switch(choice)
		{
		case 1:
			AreaInfo ai=new AreaInfo(City);
			Information i=new Information(userId,password,City);
			break;
		case 2:
			CountUsers cu=new CountUsers(City); 
			Information j=new Information(userId,password,City);
			break;
		case 3:
			NearBy n=new NearBy(City);
			Information w=new Information(userId,password,City);
			break;
		case 4:
			Quiz q=new Quiz();
			Information u=new Information(userId,password,City);
			break;
		case 5:
			Setting s=new Setting(userId,password,City);
			try
			{   
				Class.forName("oracle.jdbc.driver.OracleDriver");  
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","PROJECT","singla");   
				Statement stmt=con.createStatement(); 
				ResultSet rs=stmt.executeQuery("select userId from Users"); 
				while(rs.next())
				{ 
					if(userId.equals(rs.getString(1)))
					{ 
						Flag1=true;
					} 
					
				}
				if(Flag1==true)
				{
					Information m=new Information(userId,password,City);
				}
				else
				{
					
				}
			}
				catch(Exception e)
				{ 
					System.out.println(e);
				}
			break;
		case 6:
			Registration r=new Registration();
			Information y=new Information(userId,password,City);
			break;
		case 7:
			System.out.println("Logout Successfully.....");
			break;
		}
	}
}
