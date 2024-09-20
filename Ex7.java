package Atividade;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Quanto você ganha por hora?");
		Float din = leia.nextFloat();
		System.out.println("Quantas horas por mes você trabalha");
		Float hora = leia.nextFloat();
		
		System.out.println("Seu Salario foi: "+(hora*din));
		
		leia.close();
	}

}
