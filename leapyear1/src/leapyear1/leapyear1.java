package leapyear1;

import java.util.Scanner;

public class leapyear1 {
	public static void main(String[]args) {
		int year=2020;
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		if(year % 4==0)
		{
			if(year % 100==0)
			{
				if(year%400==0)
				{
					System.out.println("A leapyear");
				}
				else
				{
					System.out.println("not leap year");
				}
			}
		}
		sc.close();
	}

}
