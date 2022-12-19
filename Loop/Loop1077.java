package Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loop1077 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long data = Long.parseLong(br.readLine());
		long num = 0;
		for (int i = 0; i <= data; i++) {
			System.out.println(num);
			num++;
		}
	}
}