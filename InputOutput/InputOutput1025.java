package InputOutput;

import java.util.Scanner;

public class InputOutput1025 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String t = sc.nextLine();
		String[] n = t.split("");
		for (int i = 0; i < n.length; i++) {
			System.out.print("[" +n[i]);
			for (int j = n.length-1; j > i; j--) {
				System.out.print("0");
			}System.out.println("]");
		}
	}
}
