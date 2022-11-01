package InputOutput;

import java.util.Scanner;

public class InputOutput1026 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String t = sc.nextLine();
		String[] spread = t.split(":");
		int m = Integer.parseInt(spread[1]);
		System.out.printf("%d",m);
	}
}
