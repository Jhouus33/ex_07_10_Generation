package ex_07_10;

import java.util.Scanner;

public class ex4 {
	public static void main (String args[]) {
		Scanner read = new Scanner (System.in);
		int numero, raizQuadrada, eveladoAoQuadrado;
		
		
		System.out.println("Digite qualquer número: ");
		numero = read.nextInt();
			
				
		if(numero % 2 == 0) {
		raizQuadrada = (int) Math.sqrt(numero);
		System.out.println("Número PAR");
		System.out.println("Sua raiz² é " + raizQuadrada);
		
		}
		else {
			eveladoAoQuadrado = numero*numero;
			System.out.println("Número ÍMPAR");
			System.out.println("Elevado ao quadrado resulta " + eveladoAoQuadrado);
		}	
		
				
		
	}

}
