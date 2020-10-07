package ex_07_10;

import java.util.Scanner;

public class extra_ex7 {
	public static void main (String args[]) {
		Scanner read = new Scanner (System.in);
		
		float base, altura, area;
		
		
		System.out.println("Digite a base do triângulo (em cm): ");
		base = read.nextFloat();
		System.out.println("Digite a altura do triângulo (em cm): ");
		altura = read.nextFloat();
		
		if(base > 0 && altura > 0) {
			area = base*altura/2;
			System.out.println("Area total do triângulo: " + area + "cm²");
		}else {
			System.out.println("Digite apenas valores positivos.");
		}
	}
}
