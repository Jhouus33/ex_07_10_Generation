package ex_07_10;

import java.util.Scanner;

public class ex4 {
	public static void main (String args[]) {
		Scanner read = new Scanner (System.in);
		int numero, raizQuadrada, eveladoAoQuadrado;
		
		
		System.out.println("Digite qualquer n�mero: ");
		numero = read.nextInt();
			
				
		if(numero % 2 == 0) {
		raizQuadrada = (int) Math.sqrt(numero);
		System.out.println("N�mero PAR");
		System.out.println("Sua raiz� � " + raizQuadrada);
		
		}
		else {
			eveladoAoQuadrado = numero*numero;
			System.out.println("N�mero �MPAR");
			System.out.println("Elevado ao quadrado resulta " + eveladoAoQuadrado);
		}	
		
				
		
	}

}
