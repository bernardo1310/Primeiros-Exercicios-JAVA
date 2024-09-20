package Atividade;
import java.util.Scanner;
public class Ex16 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("tamanho em metros quadrados da área a ser pintada.");
		int areapintada = read.nextInt();
		int litros = areapintada/6;
		
		int lataoGrande = (int) Math.ceil((double) litros / 18);
		int lataoPequeno = (int) Math.ceil((double) litros / 3.6);
		
		float precoLataoG = lataoGrande*80;
		int precoLataoP = lataoPequeno*25;
		
		System.out.println("Litros de tinta usados: "+litros);
		System.out.println("Comprando em Latão grande: "+lataoGrande+" custando R$"+precoLataoG);
		System.out.println("Comprando em Latão pequeno: "+lataoPequeno+" custando R$"+precoLataoP);
		
		read.close();

	}

}
