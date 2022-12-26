package TotalPratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeup1081 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int num = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num2; j++) {
				System.out.printf("%d %d\n",i, j);
			}
		}
	}
}
