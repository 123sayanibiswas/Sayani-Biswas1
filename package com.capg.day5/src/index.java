import java.util.Arrays;

public class index {
	public static int findIndex(int arr[],int t) {
		int index=Arrays.binarySearch(arr, t);
		return(index<0)?-1:index;
	}
	public static void main(String[]args) {
		int[] my_array= {12,24,36,49,500};
		System.out.println("Index position of 500 is:"+findIndex(my_array, 500));
	}

}
