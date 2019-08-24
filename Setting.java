package Buddy;
import java.util.*;
import java.sql.*;
public class Setting 
{
	public Setting(String userId,String password,String City)
	{
		super();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Delete Your Account");
		System.out.println("Press 2 for Change Your AccountInfo");
		System.out.println("Press 3 to view Your AccountInfo");
		System.out.println("Press 4 to exit from setting");
		int choice=sc.nextInt();
		boolean Flag=false;
		try
		{   
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","PROJECT","singla");   
			Statement stmt=con.createStatement();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Password: ");
				String pswd=sc.next();
				ResultSet rs6=stmt.executeQuery("select password from Users where userId ='"+userId+"' "); 
				while(rs6.next())
				{ 
					if(pswd.equals(rs6.getString(1)))
					{ 
						Flag=true;
					}
					
				}
				if(Flag==true)
				{
					PreparedStatement stmt1=con.prepareStatement("delete from users where password=?");
					stmt1.setString(1,pswd);
					stmt1.executeUpdate();
					System.out.println("Delete "+userId+" Sucessfully");
				}
				else
				{
					System.out.println("Wrong Password,Enter Again");
					Setting s1=new Setting(userId,password,City);
				}
				break;
			case 2:
				System.out.println("Enter column:");
				String column=sc.next();
				System.out.println("Enter changes you want");
				String changes=sc.next();
				System.out.println("Enter Password: ");
				String pswd1=sc.next();
				ResultSet rs7=stmt.executeQuery("select password from Users where userId ='"+userId+"' "); 
				while(rs7.next())
				{ 
					if(pswd1.equals(rs7.getString(1)))
					{ 
						Flag=true;
					}
					
				}
				if(Flag==true)
				{
				stmt.executeUpdate("UPDATE users "+
									"SET "+column+"='"+changes+"' where userId ='"+userId+"' ");
				System.out.println("Changes in "+userId+" has done Sucessfully");
				ResultSet rs3=stmt.executeQuery("select * from users where userId = '"+userId+"' ");
				while(rs3.next())
				{ 
				System.out.println("Full Name: "+rs3.getString(1)+" "+rs3.getString(2)+"\nuserID: "+rs3.getString(3)+"\nDesignation: "+rs3.getString(5)+"\nCity: "+rs3.getString(6)+"\nPhone Number: "+rs3.getString(9));	
				}
				Setting s1=new Setting(userId,password,City);
				}
				break;
			case 3:
				ResultSet rs2=stmt.executeQuery("select * from users where userId ='"+userId+"' ");
				System.out.println("Reterive Data from "+userId+" Sucessfully");
				while(rs2.next())
				{ 
				System.out.println("Full Name: "+rs2.getString(1)+" "+rs2.getString(2)+"\nuserID: "+rs2.getString(3)+"\nDesignation: "+rs2.getString(5)+"\nCity: "+rs2.getString(6)+"\nPhone Number: "+rs2.getString(9));	
				}
				Setting s2=new Setting(userId,password,City);
				break;
			case 4:
				System.out.println("Exit Setting Successfully");
				Information i=new Information(userId,password,City);
				break;
			}
		}
		catch(Exception e)
		{
			System.out.println("Enter Correct Details");
			Setting s=new Setting(userId,password,City);
		}
	}
}
