package Buddy;
import java.sql.*;
import java.util.*;
public class RegisterCity
{
	public RegisterCity()
	{
		Scanner sc=new Scanner(System.in);
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","PROJECT","singla");  
			PreparedStatement stmt=con.prepareStatement("insert into Area values(?,?)");
			System.out.println("Enter City:");
			String City=sc.next();
			stmt.setString(1,City);
			System.out.println("Enter PinCode:");
			int PC=sc.nextInt();
			stmt.setInt(2,PC);
			int i=stmt.executeUpdate();
			System.out.println("Registration Sucess");
			Statement stmt11=con.createStatement();
			stmt11.executeUpdate("create table "+City+"(Name varchar2(50) primary key,Address varchar2(200) not null,PNo number(10) not null unique,Email varchar2(100) unique,Category varchar(50) not null,Rating varchar2(50))");
			//PreparedStatement stmt1=con.prepareStatement("create table "+City+"(Name varchar2(50) primary key,Address varchar2(200) not null,PNo number(10) not null unique,Email varchar2(100) unique,Category varchar(50) not null,Rating varchar2(50))");
			con.close();  
			  System.out.println("Created Database for "+City+" Sucessfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
