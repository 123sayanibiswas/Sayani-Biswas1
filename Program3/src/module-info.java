import java.util.Scanner;
class Program3 {
public static void main (String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number: ");
int num=sc.nextInt();
if( num%7==0 || num==0)
{
System.out.println("Number is divisible");
}
else
{
	System.out.println("Number is not divisible");
}
}
}
