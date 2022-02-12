package checkprimenumber;
import java.util.Scanner;


public class checkprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int num= in.nextInt();
		
		
		boolean isPrime = checkPrime(num);
		
		if(isPrime) {
			System.out.println("It is a prime number");
		}else {
			System.out.println("It is a composite number");
		}
		
	}
	
	public static boolean checkPrime(int num) {
		int cnt=0;
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				cnt++;
			}
		}
		
		if(cnt > 0) {
			return false;
		}else {
			return true;
		}
	}
}


