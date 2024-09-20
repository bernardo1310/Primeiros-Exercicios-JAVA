package Atividade;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		// A = π r²
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o valor da Area da circuferencia: ");
		Float num = leia.nextFloat();
		System.out.println("A Area é "+((num*num)*3.14));
		leia.close();
	}
}
