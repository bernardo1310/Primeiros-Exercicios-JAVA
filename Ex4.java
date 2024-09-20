
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("nota 1: ");
		float nota1 = leia.nextFloat();
		
		System.out.println("nota 2: ");
	    float nota2 = leia.nextFloat();
		
		System.out.println("nota 3: ");
		float nota3 = leia.nextFloat();
		
		System.out.println("nota 4: ");
		float nota4 = leia.nextFloat();
		
		System.out.println("A média é "+((nota1+nota2+nota3+nota4)/4));
		
		leia.close();
	}

}
