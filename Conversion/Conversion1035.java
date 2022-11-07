package Conversion;

import java.util.Scanner;

public class Conversion1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int num = Integer.parseInt(n, 16);
		System.out.printf("%o%n",num);
	}

}



