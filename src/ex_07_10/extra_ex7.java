package ex_07_10;

import java.util.Scanner;

public class extra_ex7 {
	public static void main (String args[]) {
		Scanner read = new Scanner (System.in);
		
		float base, altura, area;
		
		
		System.out.println("Digite a base do tri�ngulo (em cm): ");
		base = read.nextFloat();
		System.out.println("Digite a altura do tri�ngulo (em cm): ");
		altura = read.nextFloat();
		
		if(base > 0 && altura > 0) {
			area = base*altura/2;
			System.out.println("Area total do tri�ngulo: " + area + "cm�");
		}else {
			System.out.println("Digite apenas valores positivos.");
		}
	}
}
