
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Valor 1: ");
		int num1 = leia.nextInt();
		
		System.out.println("Valor 2: ");
		int num2 = leia.nextInt();
		
		System.out.println("A some é "+(num1+num2));
		leia.close();
	}
}
