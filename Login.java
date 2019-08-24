package Buddy;
import java.sql.*; 
import java.util.*;
public class Login
{  
public Login()
{   
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the id");  
	String id=sc.next();
	System.out.println("enter password");  
	String s=sc.next();
	String City = null;
	boolean Flag=false;
	boolean Flag1=false;
	try
	{   
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","PROJECT","singla");   
		Statement stmt=con.createStatement(); 
		ResultSet rs=stmt.executeQuery("select userId from Users"); 
		while(rs.next())
		{ 
			if(id.equals(rs.getString(1)))
			{ 
				Flag1=true;
			} 
			
		}
		if(Flag1==true)
		{
			
		}
		else
		{
			System.out.println("User doesn't Exist, Please SignUp");
			SignUp sp=new SignUp();
			Login l=new Login();
		}
		ResultSet rs1=stmt.executeQuery("select password,City from Users where userId ='"+id+"' "); 
		while(rs1.next())
		{ 
			if(s.equals(rs1.getString(1)))
			{ 
				Flag=true;
				City=(rs1.getString(2));
			}
			
		}
		if(Flag==true)
		{
			System.out.println("Welcome To Buddy");
			Information i=new Information(id,s,City);
		}
		else
		{
			System.out.println("Wrong Password,Login Again");
			Login l=new Login();
		}
	}
	catch(Exception e)
	{ 
		System.out.println(e);
	}  
} 
}


