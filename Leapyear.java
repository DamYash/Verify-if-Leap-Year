package Assignment6;
import java.util.Scanner;

public class Leapyear 
{

	public static void main(String[] args) 
	{
		int year;
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		year = console.nextInt();
		console.close();
		boolean leap = false;
		
		if(year % 4 == 0)
		{
			if(year % 100 == 0)
			{
				if(year % 400 == 0)
				{
					leap = true;
				}
				else
				{
					leap = false;
				}
			}
			else
			{
				leap = false;
			}
		}
		if(leap == true)
		{
			System.out.println(year + " is a Leap Year");
		}
		else
		{
			System.out.println(year + " is not a Leap Year");
		}
		
	}

}

/** Output:
Enter the Year: 
1900
1900 is not a Leap Year
**/
