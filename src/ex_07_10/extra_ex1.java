package ex_07_10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class extra_ex1 {
	public static void main (String args[]) {
		Scanner read = new Scanner (System.in);
		
		float P, E, M;
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("Digite o peso das tomates em KG: ");
		P = read.nextFloat();
		if(P > 50) {
			E = P - 50;
			M = E * 4;
			System.out.println("Excesso: "+ df.format(E) + "kg. Multa total R$: " + df.format(M));
		}else {
			System.out.println("ZERO");
		}
		
	}
}
