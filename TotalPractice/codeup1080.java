package TotalPratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup1080 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int cnt = 0;
		for (int i = 0; i <= num; i++) {
			cnt += i;
			if (num <= cnt) {
				System.out.println(i);
				break;
			}
		}
	}
}
