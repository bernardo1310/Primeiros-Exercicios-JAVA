
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Valor em Metros: ");
		float metros = leia.nextFloat();
		System.out.println((metros*100)+"cm");
		leia.close();
	}
}
