package InputOutput;

import java.util.Scanner;

public class InputOutput1027 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		String[] spread = date.split("\\.");
		int y = Integer.parseInt(spread[0]);
		int m = Integer.parseInt(spread[1]);
		int d = Integer.parseInt(spread[2]);
		System.out.printf("%02d-%02d-%04d",d,m,y);
	}
}
