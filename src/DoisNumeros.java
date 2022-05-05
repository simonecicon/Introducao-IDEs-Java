import java.util.Scanner;

public class DoisNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int resultado;

		System.out.println("Digite um numero:");
		num1 = sc.nextInt();

		System.out.println("Digite um numero:");
		num2 = sc.nextInt();

		if (num1 == num2) {
			resultado = num1 + num2;
		} else {
			resultado = num1 * num2;
		}
		System.out.println("\nnumero 1: " + num1 + "\nnumero 2: " + num2 + "\nResultado: " + resultado);
	}

}
