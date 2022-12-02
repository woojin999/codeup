package Conditional;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Conditional1065 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long a = Long.parseLong(br.readLine());
		long b = Long.parseLong(br.readLine());
		long c = Long.parseLong(br.readLine());
		
		if (a % 2 == 0) {
			System.out.println(a);
		}
		if (b % 2 == 0) {
			System.out.println(b);
		}
		if (c % 2 == 0) {
			System.out.println(c);
		}
		
		
	}
}
