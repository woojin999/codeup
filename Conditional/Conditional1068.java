package Conditional;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Conditional1068 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long a = Long.parseLong(br.readLine());
		
		if (89 < a) {
			System.out.println("A");
		}else if (69 < a) {
			System.out.println("B");
		} else if(39 < a) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		
		
	}
}
