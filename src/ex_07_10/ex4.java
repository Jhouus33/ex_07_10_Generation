package ex_07_10;

import java.text.DecimalFormat;
import java.util.Scanner;


public class ex4 {
	public static void main (String args[]) {
		Scanner read = new Scanner (System.in);
		int numero, elevadoAoQuadrado;
		double raizQuadrada;
		DecimalFormat df = new DecimalFormat("#.000");
		
		System.out.println("Digite qualquer n�mero: ");
		numero = read.nextInt();
			
				
		if(numero % 2 == 0) {
		raizQuadrada = Math.sqrt(numero);
		System.out.println("N�mero PAR");
		System.out.println("Sua raiz� � " + df.format(raizQuadrada));
		
		}
		else {
			elevadoAoQuadrado = numero*numero;
			System.out.println("N�mero �MPAR");
			System.out.println("Elevado ao quadrado resulta " + elevadoAoQuadrado);
		}	
		
				
		
	}

}
