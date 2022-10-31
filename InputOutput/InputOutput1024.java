package InputOutput;

import java.util.Scanner;

public class InputOutput1024 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String t = sc.nextLine();
		String[] n = t.split("");
		for (int i = 0; i < n.length; i++) {
			System.out.println("'" +n[i] + "'");
		}
	}
}
