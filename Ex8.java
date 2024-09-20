package Atividade;
import java.util.Scanner;
public class Ex8 {
	public static void main(String[] args) {
		Scanner read =  new Scanner(System.in);
		System.out.println("A temperatura em graus Farenheit: ");
		Float tempFar = read.nextFloat();
		System.out.println("Celsius = "+ (5*(tempFar-32)/9));
		read.close();
	}
}
