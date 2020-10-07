package ex_07_10;


import java.util.Scanner;

public class extra_ex5 {
	public static void main (String args[]) {
		Scanner read = new Scanner (System.in);
		
		float indice;
		
		
		System.out.println("Digite o indice de poluição atual (entre 0,05 e 0,30): ");
		indice = read.nextFloat();
		
		
		if(indice >= 0.3 && indice <= 0.39) {
			System.out.println("Empresas do grupo 1º deverão suspender atividades.");
		}else if(indice > 0.4 && indice <= 0.49) {
			System.out.println("Empresas dos grupos 1º e 2º deverão suspender atividades.");
		}else if(indice > 0.50) {
			System.out.println("Empresas de todos os grupos deverão suspender atividades.");
		}else {
			System.out.println("Indice ok.");
		}
	}

}
