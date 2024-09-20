
import java.util.Scanner;

public class OlaMundo {
	public static void main(String[] args) {
		/*Hello word*/
		System.out.println("Hello word");

		/*Leitura*/
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um valor (int): ");
		int numI = entrada.nextInt();
		
		System.out.println("Informe um valor (float): ");
		float numF = entrada.nextFloat();
		
		System.out.println("Informe um valor (Double): ");
		double numD = entrada.nextDouble();
		
		entrada.nextLine();
		
		System.out.println("Informe um valor (String): ");
		String texto = entrada.nextLine();
		
		System.out.println("Informe um valor (char): ");
		char letra = entrada.nextLine().charAt(0);

		boolean teste = true;
		


		/*Escreva*/
		System.out.println("Numero inteiro: "+numI);
		System.out.println("Numero real: "+numF);
		System.out.println("Numero double: "+numD);
		System.out.println("Letra: "+letra);
		System.out.println("tipo booleano:"+teste);
		System.out.println("nome: "+texto);

		/*Fechando o leia*/
		entrada.close();
	}

}
