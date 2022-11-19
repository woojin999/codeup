package Operation;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Operation1054 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long a = Long.parseLong(br.readLine());
		long b = Long.parseLong(br.readLine());
		
		if (a == 1 && b == 1) {
			System.out.print(1);
		} else {
			System.out.print(0);
		}
		
	}
}
