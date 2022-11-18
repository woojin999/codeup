package Operation;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Operation1053 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long a = Long.parseLong(br.readLine());
		
		if (a == 1) {
			System.out.println("0");
		} else {
			System.out.println("1");
		}
		
	}
}
