package Operation;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Operation1058 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long a = Long.parseLong(br.readLine());
		long b = Long.parseLong(br.readLine());
		
		if (a == 0 && b == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}
}
