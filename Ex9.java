package Atividade;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Informe o lado do quadrado: ");
		int lado = read.nextInt();
		System.out.println("Area do Quadrado: "+(lado*lado));
		read.close();

	}

}
