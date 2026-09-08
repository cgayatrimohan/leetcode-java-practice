package coddy;

public class FindPrimeNumber {

	public static void main(String[] args) {
		int num = 9;
		System.out.println(isPrime(num));
		
		System.out.println("----------------------");
		System.out.println("Print prime numbers from 1 to " + num);
		
		for(int i = 0; i <= num; i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}

	}

	public static boolean isPrime(int num) {
		if(num <= 1) return false;
		if(num == 2) return true;
		if(num % 2 == 0) return false;
		
		for(int i = 2; i * i <= num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
