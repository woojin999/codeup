package Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loop1074 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		while (true) {
			if (num != 0) {
				System.out.println(num);
				num--;
			} else {
				break;
			}
		}
	}
}