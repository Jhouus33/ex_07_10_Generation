package ex_07_10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class extra_ex4 {
	
	
		public static void main (String args[]) {
			Scanner read = new Scanner (System.in);
			
			int A;
			
			System.out.println("Digite um n�mero: ");
			A = read.nextInt();
			
			if(A % 2 == 0) {
				if(A > 0){
					System.out.println("N�mero par e positivo");
				}else {
					System.out.println("N�mero par e negativo");
				}
			}else{
				if(A > 0){
					System.out.println("N�mero �mpar e positivo");
				}else {
					System.out.println("N�mero �mpar e negativo");
				}
			}
			
		}		
}
