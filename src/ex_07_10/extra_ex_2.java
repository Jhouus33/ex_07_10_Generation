package ex_07_10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class extra_ex_2 {
	public static void main (String args[]) {
		Scanner read = new Scanner (System.in);
		int C;
		float N, E, salarioTotal;
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("Digite seu c�digo: ");
		C = read.nextInt();
			if(C == 33) {
				System.out.println("Ol� Jonathan. ");
			}
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		N = read.nextFloat();
		
		if(N > 50) {
			E = (N-50);
			salarioTotal = E*20+10*50;
			System.out.println("Sal�rio excedente R$: " + E*20 +".");
			
			
			System.out.println("Sal�rio TOTAL R$: " + df.format(salarioTotal) +".");
		}else {
			E = 0;
			System.out.println(" Sal�rio TOTAL R$: " + (E+(10*N)) +".");
		}
	}
}
