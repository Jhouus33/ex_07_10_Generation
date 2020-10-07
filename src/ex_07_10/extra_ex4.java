package ex_07_10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class extra_ex4 {
	
	
		public static void main (String args[]) {
			Scanner read = new Scanner (System.in);
			
			int A;
			
			System.out.println("Digite um número: ");
			A = read.nextInt();
			
			if(A % 2 == 0) {
				if(A > 0){
					System.out.println("Número par e positivo");
				}else {
					System.out.println("Número par e negativo");
				}
			}else{
				if(A > 0){
					System.out.println("Número ímpar e positivo");
				}else {
					System.out.println("Número ímpar e negativo");
				}
			}
			
		}		
}
