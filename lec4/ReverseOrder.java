package lec4;

public class ReverseOrder {
	static int num, sum;
	static String str ="";
	
	public static void digitsReverse(int n) {
		if(n == 0) {
			
			System.out.print("\n");
			
			return ;
		}
		
		System.out.print(n%10);
		digitsReverse(n/10);
	}
	public static int digitsCount(int n) {
		if( n == 0) {
			return n;
		}
		
		
		return n%10 + digitsCount(n/10);
		
		
		
	}
	
	public static int arraySum(int[] arr, int n) {
		if(n == 0) {
			return 0;
		}else {
			
			return arr[n-1] + arraySum(arr, n-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		
		digitsReverse(12345);
		System.out.println(digitsCount(123));
		System.out.println(arraySum(arr, 3));
	}

}
