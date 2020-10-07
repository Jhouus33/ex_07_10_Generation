package ex_07_10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class extra_ex3 {
	public static void main (String args[]) {
		Scanner read = new Scanner (System.in);
		
		float A, B, C, D;
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("Digite o valor do primeiro número: ");
		A = read.nextFloat();
		
		System.out.println("Digite o valor do segundo número: ");
		B = read.nextFloat();
		
		System.out.println("Digite o valor do terceiro número: ");
		C = read.nextFloat();
		float quadradoC = C*C;
		
		System.out.println("Digite o valor do quarto número: ");
		D = read.nextFloat();
		
		
		if(quadradoC >= 1000) {
			System.out.println("Terceiro número ao quadrado: "+ df.format(C*C));
		}else {
			System.out.println("Números lidos: "+A+", "+B+", "+C+", "+D);
			System.out.println("Seus quadrados : "+A*A+", "+B*B+", "+C*C+", "+D*D+ " respectivamente.");
		}
		
	}
}
