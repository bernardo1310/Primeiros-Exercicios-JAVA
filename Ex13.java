package Atividade;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe os KG do peixe: ");
		Float peso = leia.nextFloat();
		
		if(peso>50) {
			System.out.println("Seu peixe pesa: "+peso+" ultrapassando  "+(peso-50)+"Kg");
			System.out.println("Você pagara: "+(peso-50)*4);
		}
		else {
			System.out.println("Seu peixe não ultrapassou os 50Kg ");
		}
		leia.close();
	}

}
