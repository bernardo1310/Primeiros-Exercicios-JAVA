package Atividade;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		System.out.println("Informe a altura: ");
		Float alt = read.nextFloat();
		System.out.println("O peso ideal Masculino: "+((72.7*alt)-58));
		System.out.println("O peso ideal Feminino: "+((62.1*alt) - 44.7));
		read.close();
	}

}
