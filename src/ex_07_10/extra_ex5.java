package ex_07_10;


import java.util.Scanner;

public class extra_ex5 {
	public static void main (String args[]) {
		Scanner read = new Scanner (System.in);
		
		float indice;
		
		
		System.out.println("Digite o indice de polui��o atual (entre 0,05 e 0,30): ");
		indice = read.nextFloat();
		
		
		if(indice >= 0.3 && indice <= 0.39) {
			System.out.println("Empresas do grupo 1� dever�o suspender atividades.");
		}else if(indice > 0.4 && indice <= 0.49) {
			System.out.println("Empresas dos grupos 1� e 2� dever�o suspender atividades.");
		}else if(indice > 0.50) {
			System.out.println("Empresas de todos os grupos dever�o suspender atividades.");
		}else {
			System.out.println("Indice ok.");
		}
	}

}
