package Loop;

import java.util.Scanner;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;

public class Loop1072 {

	public static void main(String[] args) {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int count = Integer.parseInt(br.readLine());
//		int array[] = new int[count];
//		StringTokenizer st = new StringTokenizer(br.readLine()," ");
//		
//		for (int i = 0; i < count; i++) {
//			array[i] = Integer.parseInt(st.nextToken());
//			System.out.println(array[i]);
//		}
		 Scanner sc = new Scanner(System.in);

		    int n = sc.nextInt();
		    int arr[] = new int[n];

		    for(int i=0; i<n; i++) {
		    	arr[i] = sc.nextInt();
		    	System.out.println(arr[i]);
		    }
	}
}
