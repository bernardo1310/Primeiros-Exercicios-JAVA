package Atividade;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		System.out.println("Informe sua altura: ");
		Float alt = read.nextFloat();
		System.out.println("Seu peso ideal: "+((72.7*alt)-58));
		
		read.close();
	}

}
