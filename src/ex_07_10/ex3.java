package ex_07_10;

import java.util.Scanner;

public class ex3 {
	public static void main (String args[]) {
		Scanner read = new Scanner (System.in);
		int idade;
		// 2 , 5 , 10
		
		System.out.println("Digite sua idade: ");
		idade = read.nextInt();
			
				
		if(idade >= 10 && idade <= 14) {
		System.out.println("Bem vindo a categoria Infantil");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Bem vindo a categoria Juvenil");
			
		}else if(idade >= 18 && idade <= 25) {
			System.out.println("Bem vindo a categoria Adulto");
			
		}else if(idade < 10) {
			System.out.println("Retorne assim que atingir 10 anos");
			
		}else {
			System.out.println("Chegou a hora de buscar outra atividade vovó");
		}
				
		
	}
	
}
