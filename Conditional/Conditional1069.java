package Conditional;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Conditional1069 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String a = br.readLine();
		
		switch (a) {
		case "A":
				System.out.println("best!!!");
			break;
		case "B":
			System.out.println("good!!");
			break;
		case "C":
			System.out.println("run!");
	break;
		case "D":
			System.out.println("slowly~");
	break;
		default:
			System.out.println("what?");
			break;
		}
	}
}
