package Loop;

import java.util.Scanner;

public class Loop1073 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			int num = sc.nextInt();
			if (num != 0) {
				System.out.println(num);
			} else {
				break;
			}
		}
	}
}


//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Operation1073 {
//
//	public static void main(String[] args) throws IOException {
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		while (true) {
//			int num = Integer.parseInt(br.readLine());
//			if (num != 0) {
//				System.out.println(num);
//			} else {
//				break;
//			}
//		}
//	}
//}