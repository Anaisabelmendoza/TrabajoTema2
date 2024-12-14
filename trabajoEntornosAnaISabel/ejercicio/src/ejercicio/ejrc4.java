package ejercicio;

import java.util.Scanner;

public class ejrc4 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println(" introduce un numero");
		int numero = scanner.nextInt();

		if (numero % 2 == 0) {
			System.out.println(" el numero es par");
		} else {
			System.out.println(" el numero es impar");
		}
	}
}
