package InputOutput;

import java.util.Scanner;

public class InputOutput1018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.next();
//		System.out.println(time);
		String[] spread = time.split(":");
		System.out.println(spread[0] + ":" + spread[1]);
	}
}
