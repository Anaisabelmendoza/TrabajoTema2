package ejercicio4;

import java.util.Scanner;

public class ejer4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" introduce un numero");
		int numero = scanner.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(" el numero es par");
		}else {
			System.out.println(" el numero es impar");
		}
	}

}
