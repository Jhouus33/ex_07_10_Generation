package ex_07_10;

import java.util.Scanner;

public class extra_ex8 {
	public static void main (String args[]) {
		Scanner read = new Scanner (System.in);
		
		int N;
		
		System.out.println("Digite sum número: ");
		N = read.nextInt();
		
		if(N > 100) {
			System.out.println(N);
		}else {
			System.out.println(0);
		}
	}
}
