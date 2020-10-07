package ex_07_10;

import java.util.Scanner;

public class extra_ex6 {
	public static void main (String args[]) {
		Scanner read = new Scanner (System.in);
		
		int idade;
		
		
		System.out.println("Digite sua idade e descubra sua categoria: ");
		idade = read.nextInt();
		
		
		if(idade >= 5 && idade <= 7) {
			System.out.println("Infantil A.");
		}else if(idade >= 8 && idade <= 11) {
			System.out.println("Infantil B.");
		}else if(idade >= 12 && idade <= 13) {
			System.out.println("Juvenil A.");
		}else if(idade >= 14 && idade <= 17) {
			System.out.println("Juvenil B.");
		}else if(idade >= 18) {
			System.out.println("Adultos");
		}else {
			System.out.println("Volte após completar 5 anos.");
		}
	}
}
