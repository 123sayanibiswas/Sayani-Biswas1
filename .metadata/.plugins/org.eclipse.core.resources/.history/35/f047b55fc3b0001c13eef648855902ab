import java.util.Scanner;

public class ElementDelete {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		int []intArr =new int[] {12,15,20,33,60,80,100};
		System.out.println("Enter the element to be deleted: ");
		int elem= in.nextInt();
		for(int i=0;i<intArr.length;i++) {
			if(intArr[i]==elem) {
				for(int j=i;j<intArr.length-1;j++) {
					intArr[j]=intArr[j+1];
				}break;
			}
		}
		System.out.println("Element--");
		for(int i=0;i<intArr.length;i++) {
			System.out.println(" "+intArr[i]);
		}
		
	}

}
