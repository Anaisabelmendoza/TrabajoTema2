package ejerciio9;

public class Factoriales {
	public static void main(String[] args) {
		int m = 5;
		int n = 10;
		
		int suma_de_factoriales = sumarFactoriales(m, n);

	}

	public static int sumarFactoriales(int param1, int param2) {
		int factorial1 = factorial(param1);
		int factorial2 = factorial(param2);
		int resultado = sumar(factorial1, factorial2);
		return resultado;
	}

	public static int factorial(int param) {
		int resultado = 1;
		for (int i = 1; i <= param; i++) {
			resultado *= i;
		}
		return resultado;
	}

	public static int sumar(int param1, int param2) {
		return param1 + param2;
	}

	}

}
