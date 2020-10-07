package ex_07_10;

import java.util.Scanner;

public class ex2 {
	public static void main (String args[]) {
		Scanner read = new Scanner (System.in);
		int a, b, c, numMaior = 0;
		// 2 , 5 , 10
		
		System.out.println("Digite o primeiro número: ");
		a = read.nextInt();
			
		System.out.println("Digite o segundo número: ");
		b = read.nextInt();
			
		System.out.println("Digite o terceiro número: ");
		c = read.nextInt();
		
		System.out.println("Numeros digitados: "+a +", " + b +", " + c +".");
		
		if(a < b) {
			if(b < c) {
				System.out.println("Ordem crescente: "+ a + " " + b + " " + c );
			}
			else if(a < c) {
				System.out.println("Ordem crescente: "+ a + " " + c + " " + b );
			}
			else {
				System.out.println("Ordem crescente: "+ c + " " + a + " " + b );
			}
		}else if(b < c){
			if(a < c) {
				System.out.println("Ordem crescente: "+ b + " " + a + " " + c );
			}else {
				System.out.println("Ordem crescente: "+ b + " " + c + " " + a );
			}
			
		}else {
			System.out.println("Ordem crescente: "+ c + ", " + b + ", " + a );
		}
		
		
				
		
	}
	
}
