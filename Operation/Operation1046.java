package Operation;

import java.util.Scanner;

public class Operation1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long sum = a + b + c;
		float avg = (float)sum/3;
		System.out.println(sum);
		System.out.printf("%.1f" , avg);
		
	}
}
