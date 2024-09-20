package Atividade;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Informe o primeiro numero inteiro:");
		int int1 = read.nextInt();
		System.out.println("Informe o segundo numero inteiro:");
		int int2 = read.nextInt();
		System.out.println("Informe um numero real:");
		Float real1 = read.nextFloat();

		System.out.println("o produto do dobro do primeiro com metade do segundo = "+((int1*2)+int2/2));
		System.out.println("a soma do triplo do primeiro com o terceiro = "+ ((int1*3)+real1));
		System.out.println("o terceiro elevado ao cubo = "+(real1*real1*real1));
		
		read.close();
		
	}

}
