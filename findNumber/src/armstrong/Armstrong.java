package armstrong;

public class Armstrong {
	 public static int main(String[]args)
	 {
		 int n;
	 int temp=n;
	 int count=CountDigit(n);
	 int sum=0;
	 while(n>0)
	 {
	 	n=n%10;
	 	int r=n%10;
	 	int p=findPower(r,c);
	 	sum=sum+p;
	 	n=n/10;
	 }
	 if(sum==temp)
	 	System.out.println("armstrong number");
	 }
	}
	 



