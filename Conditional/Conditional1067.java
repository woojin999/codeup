package Conditional;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Conditional1067 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long a = Long.parseLong(br.readLine());
		
		if (a < 0) {
			System.out.println("minus");
		}else {
			System.out.println("plus");
		}
		
		if (a % 2 == 0) {
			System.out.println("even");
		} else  {
			System.out.println("odd");
		}
		
		
	}
}
