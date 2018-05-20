
public class Fibonacci {

	public static int fibonacci(int n){
		if(n==0){
			return 0; 
		}
		else if(n==1){
			return 1;
		}
		else{
			return(   fibonacci(n-1)  +   fibonacci(n-2)  );
		}
	}
	
	public static int fibonacciBetter(int n){
		int [] fibs2Previous = fibBetterHelper(n); // helper will return the last 2 values
		return (fibs2Previous[0] + fibs2Previous[1]);
	}
	
	
	private static int[] fibBetterHelper(int n){
		if(n<=1){
			int [] answer = {0,n};
			return answer;
		}
		else{
			int [] temp = fibBetterHelper(n-1);
			int [] answer = { (temp[0] + temp[1]) ,  temp[0] };
			return answer;
		}
	}
	
}
