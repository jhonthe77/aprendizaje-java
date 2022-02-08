package Ejercicios;

public class Piramide_dearrobas {
	static int contador;

	public static void main(String[] args) {

		int fila_inical = 5;
		@SuppressWarnings("unused")
		int final1 = 13;

		for (int i = 0; i <= fila_inical; i++) {

			for (int z = 5; i <= z; z--) {

				System.out.print("-");
				contador++;
			}

			for (int j = 0; j <= i * 2; j++) {

				System.out.print("*");
			}
			System.out.println("--");

		}
		System.out.print("-");

		for (int i = 0; i <= 5; i++) {

			for (int z = 10; z >= i * 2; z--) {
				System.out.print("*");

			}
			System.out.println("--");
			System.out.print("-");
			for (int j = 0; j <=i; j++) {
				System.out.print("-");
			}

		}
	}

}
