package Buddy;
import java.util.*;
public class Cricket 
{
	public Cricket()
	{
		Scanner sc=new Scanner(System.in);
		int score=0;
		System.out.println("=======================CRICKET QUIZ================================");
		System.out.println("Ques A) Which cricketer had scored highest individual score in ODI cricket?");
		System.out.println("1: Virender Sehwag");
		System.out.println("2: Chris Gayle");
		System.out.println("3: Martin Guptill");
		System.out.println("4: Rohit Sharma");
		int choice=sc.nextInt();
		if(choice==4)
		{
			score++;
		}
		else
		{
			
		}
		System.out.println("Ques B) Which cricketer had scored most test runs in year a calendar year?");
		System.out.println("1: V.V.S Laxman");
		System.out.println("2: Mohamed Yusuf");
		System.out.println("3: Rahul Dravid");
		System.out.println("4: Steve Waugh");
		int choice1=sc.nextInt();
		if(choice1==2)
		{
			score++;
		}
		else
		{
			
		}
		System.out.println("Ques C) Which cricketer had scored most centuries in first-class cricket?");
		System.out.println("1: Lane Hutton");
		System.out.println("2: Wally Hammond");
		System.out.println("3: Jack Hobbs");
		System.out.println("4: Sachin Tendulkae");
		int choice2=sc.nextInt();
		if(choice2==3)
		{
			score++;
		}
		else
		{
			
		}
		System.out.println("Ques D) Who was the first cricketer to take a hattrick in a World Cup ODI match?");
		System.out.println("1: Chetan Sharma");
		System.out.println("2: Glenn Turner");
		System.out.println("3: Wasim Akram");
		System.out.println("4: Dennis Lille");
		int choice3=sc.nextInt();
		if(choice3==1)
		{
			score++;
		}
		else
		{
			
		}
		System.out.println("Final Score: "+score+"/4");
		System.out.println("Press 1 to Retake Quiz");
		System.out.println("Press 2 for Test Analysis");
		System.out.println("Press any key from 3-9 to exit");
		int choice4=sc.nextInt();
		switch(choice4)
		{
		case 1:
			Cricket c=new Cricket();
			break;
		case 2:
			System.out.print("Ques A)");
			if(choice==4)
			{
				System.out.println("Correct");
			}
			else
			{
				System.out.println("Wrong, Correct Answer - 4: Rohit Sharma ");
			}
			System.out.print("Ques B)");
			if(choice1==2)
			{
				System.out.println("Correct");
			}
			else
			{
				System.out.println("Wrong, Correct Answer - 2: Mohamed Yusuf  ");
			}
			System.out.print("Ques C)");
			if(choice2==3)
			{
				System.out.println("Correct");
			}
			else
			{
				System.out.println("Wrong, Correct Answer - 3: Jack Hobbs ");
			}
			System.out.print("Ques D)");
			if(choice3==1)
			{
				System.out.println("Correct");
			}
			else
			{
				System.out.println("Wrong, Correct Answer - 1: Chetan Sharma ");
			}
			System.out.println("Retake Quiz - Yes/No ?");
			String r=sc.next();
			if(r.equalsIgnoreCase("Yes"))
			{
				Cricket ckt=new Cricket();
			}
			else
			{
				System.out.println("Thank You For Taking Quiz");
			}
			break;
		default:
			break;
		}
	}
}
