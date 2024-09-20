package Atividade;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("tamanho em metros quadrados da área a ser pintada.");
		int areapintada = read.nextInt();
		int litros = areapintada/3;
		int latao = (17+litros)/18;
		float preco = latao*80;
		System.out.println("Sera necessario "+latao+" latões de tinta\nValor gasto: "+preco);
		read.close();
	}
}
