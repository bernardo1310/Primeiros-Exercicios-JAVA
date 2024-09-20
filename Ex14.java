package Atividade;

import java.util.Scanner;
		
public class Ex14 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Quanto você ganha por hora:");
		int sal = read.nextInt();
		System.out.println("o número de horas trabalhadas no mês:");
		int hora = read.nextInt();
		
		float salph = hora*sal;
		double inss = salph*0.08;
		double sind = salph*0.05;
		double ir = salph*0.11;
		
		System.out.println("Seu salario bruto é "+salph);
		System.out.println("pagou ao INSS: "+(inss));
		System.out.println("pagou ao sindicato: "+(sind));
		System.out.println("pagou de imporsto de renda: "+(ir));
		System.out.println("salário líquido: "+(((salph-sind)-inss)-ir));
		
		read.close();
	}

}
