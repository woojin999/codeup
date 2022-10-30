package InputOutput;

import java.util.Scanner;

public class InputOutput1020 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		String[] spread = num.split("\\-");
		int num1 = Integer.parseInt(spread[0]);
		int num2 = Integer.parseInt(spread[1]);
		System.out.printf("%d%d", num1, num2);
	}
}
