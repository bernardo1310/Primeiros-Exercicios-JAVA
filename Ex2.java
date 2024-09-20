
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		int numI = leia.nextInt();	
		System.out.println("O numero informado foi "+numI);
		leia.close();
	}
}
