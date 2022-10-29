package InputOutput;

import java.util.Scanner;

public class InputOutput1019 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		String[] spread = date.split("\\.");
		int date1 = Integer.parseInt(spread[0]);
		int date2 = Integer.parseInt(spread[1]);
		int date3 = Integer.parseInt(spread[2]);
		System.out.printf("%04d.%02d.%02d", date1, date2, date3);
	}
}
