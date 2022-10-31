package InputOutput;

import java.util.Scanner;

public class InputOutput1023 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String t = sc.nextLine();
		String[] n = t.split("\\.");
		int n1 = Integer.parseInt(n[0]);
		int n2 = Integer.parseInt(n[1]);
		System.out.printf("%d\n%d",n1,n2);
	}
}
