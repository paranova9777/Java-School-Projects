import java.util.Scanner;

public class ValidatedDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int year;
		boolean valid = false;
		System.out.print("Please enter a year: ");
		year = scan.nextInt();
		
		while (!(year<=2015 && year>1900))
		{
			System.out.print("Please enter a VALID year: ");
			year = scan.nextInt();
		}
		
		System.out.print("Please enter a month(number 1-12):");
		int month = scan.nextInt();
		
		while(!(month<=12 && month>=1))
		{
			System.out.print("Please enter a VALID month(number 1-12):");
			month = scan.nextInt();
		}
			
		int day=0;
		
		int range;
		
		while(valid==false)
		{
			System.out.println("Please enter a day:");
			day= scan.nextInt();
			if(month==9 || month==6 || month==5 || month==11)
			{
			range = 30;
			}
			else if(month==2)
			{
				if(isLeapYear(year))
				{
					range=29;
				}
				else
				{
					range=28;
				}
			}
			else
			{
				range=31;
			}
			
			if (day<=range && day>=1)
			{
				valid=true;
			}
			else
			{
				valid=false;
			}
		}
		System.out.print("Your date is " + year +" "+ month +" "+ day);
		}

	public static boolean isLeapYear(int year){
	// TODO Auto-generated method stub
	
	
	
	if (year<1582)
		{
		System.out.println("Please enter a year greater than 1582");
		}
	
	
	if (year%4==0 && year%100!=0 || year%400==0)
	{
		return true;
	}
	
	else
		return false;

	}
	}
