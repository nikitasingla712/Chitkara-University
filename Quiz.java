package Buddy;
import java.util.*;
import java.sql.*;
public class Quiz
{
	public Quiz()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Cricket Quiz");
		System.out.println("Press 2 for Technical Quiz");
		System.out.println("Press any key from 3-9 to Exit Quiz");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			Cricket c=new Cricket();
			Quiz r=new Quiz();
			break;
		case 2:
			Technical t=new Technical();
			Quiz q=new Quiz();
			break;
		default:
			System.out.println("successfully exit from exit");	
			break;
		}
	}
}
