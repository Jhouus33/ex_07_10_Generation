package ex_07_10;

import java.util.Scanner;

public class ex1 {

	public static void main (String args[]) {
		Scanner read = new Scanner (System.in);
		int a, b, c, numMaior = 0;
		
		System.out.println("Digite o primeiro número: ");
		a = read.nextInt();
			if(a > numMaior) {
				numMaior = a;
			}
		System.out.println("Digite o segundo número: ");
		b = read.nextInt();
			if(b > numMaior) {
				numMaior = b;
			}
		System.out.println("Digite o terceiro número: ");
		c = read.nextInt();
			if(c > numMaior) {
				numMaior = c;
			}
		System.out.println("Numeros digitados: "+a +", " + b +", " + c +".");
				
		System.out.println("\n Número maior digitado = " + numMaior +".");
	}
	
}
