package Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loop1076 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char data = br.readLine().charAt(0);
		
		char a = 'a';
		while (a <= data) {
				System.out.print(a + " ");
				a++;
		}
	}
}