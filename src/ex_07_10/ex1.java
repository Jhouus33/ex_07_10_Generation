package ex_07_10;

import java.util.Scanner;

public class ex1 {

	public static void main (String args[]) {
		Scanner read = new Scanner (System.in);
		int a, b, c, numMaior = 0;
		
		System.out.println("Digite o primeiro n�mero: ");
		a = read.nextInt();
			if(a > numMaior) {
				numMaior = a;
			}
		System.out.println("Digite o segundo n�mero: ");
		b = read.nextInt();
			if(b > numMaior) {
				numMaior = b;
			}
		System.out.println("Digite o terceiro n�mero: ");
		c = read.nextInt();
			if(c > numMaior) {
				numMaior = c;
			}
		System.out.println("Numeros digitados: "+a +", " + b +", " + c +".");
				
		System.out.println("\n N�mero maior digitado = " + numMaior +".");
	}
	
}
