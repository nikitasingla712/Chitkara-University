package Buddy;
import java.util.*;
public class Technical 
{
	public Technical()
	{
		Scanner sc=new Scanner(System.in);
		int score=0;
		System.out.println("=======================TECHNICAL QUIZ================================");
		System.out.println("Ques A) Number of bit used by the IPc6 address - ");
		System.out.println("1: 32");
		System.out.println("2: 64");
		System.out.println("3: 128");
		System.out.println("4: 256");
		int choice=sc.nextInt();
		if(choice==3)
		{
			score++;
		}
		else
		{
			
		}
		System.out.println("Ques B) Which one is the first web browser invented in 1990?");
		System.out.println("1: Internet Explorer");
		System.out.println("2: Mosaic");
		System.out.println("3: Mozilla");
		System.out.println("4: Nexus");
		int choice1=sc.nextInt();
		if(choice1==4)
		{
			score++;
		}
		else
		{
			
		}
		System.out.println("Ques C) Firewall in computer is used for - ");
		System.out.println("1: Security");
		System.out.println("2: Data Transmission");
		System.out.println("3: Authentication");
		System.out.println("4: Monitoring");
		int choice2=sc.nextInt();
		if(choice2==1)
		{
			score++;
		}
		else
		{
			
		}
		System.out.println("Ques D) Which of the following is not an operating system?");
		System.out.println("1: DOS ");
		System.out.println("2: Mac ");
		System.out.println("3: C ");
		System.out.println("4: Linux");
		int choice3=sc.nextInt();
		if(choice3==3)
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
			Technical c=new Technical();
			break;
		case 2:
			System.out.print("Ques A)");
			if(choice==3)
			{
				System.out.println("Correct");
			}
			else
			{
				System.out.println("Wrong, Correct Answer - 3: 128 ");
			}
			System.out.print("Ques B)");
			if(choice1==4)
			{
				System.out.println("Correct");
			}
			else
			{
				System.out.println("Wrong, Correct Answer - 4: Nexus  ");
			}
			System.out.print("Ques C)");
			if(choice2==1)
			{
				System.out.println("Correct");
			}
			else
			{
				System.out.println("Wrong, Correct Answer - 1: Security ");
			}
			System.out.print("Ques D)");
			if(choice3==3)
			{
				System.out.println("Correct");
			}
			else
			{
				System.out.println("Wrong, Correct Answer - 3: C ");
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
