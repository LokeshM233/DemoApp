package in.lokesh.main;
// sum of odd numbers 1+3+5+7+...+99
public class SumofOddNum {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 100; i += 2) {
			sum += i;
		}
		System.out.println("Sum of odd numbers from 1 to 99 is: " + sum);
		
		// Using a while loop
		int j = 1;
		int sumWhile = 0;
		while (j < 100) {
			sumWhile += j;
			j += 2;
		}
		System.out.println("Sum of odd numbers from 1 to 99 using while loop is: " + sumWhile);
		
		// Using a do-while loop
		int k = 1;
		int sumDoWhile = 0;
		do {
			sumDoWhile += k;
			k += 2;
		} while (k < 100);
		
		System.out.println("Sum of odd numbers from 1 to 99 using do-while loop is: " + sumDoWhile);

	}

}
