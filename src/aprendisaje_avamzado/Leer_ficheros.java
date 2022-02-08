package aprendisaje_avamzado;

import java.io.*;

public class Leer_ficheros {
	public static void main(String[] args) {
		Leer_ficheros l = new Leer_ficheros();
		 escibrir nm = new escibrir();
		buffer n = new buffer();
	}

	public Leer_ficheros() {

		try {
			FileReader Leer = new FileReader("C:/Users/DIOS/Desktop/Nuevo documento de texto.txt");

			int c = 0;

			while (c != -1) {

				c = Leer.read();

				char letra = (char) c;

				System.out.print(letra);

			}

			Leer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

class escibrir {

	public escibrir() {

		String escibiendo = "jhon eres un tipo inteligente";

		try {
			FileWriter escibo = new FileWriter("C:/Users/DIOS/Desktop/Nuevo documento texto.txt");
			for (int i = 0; i < escibiendo.length(); i++) {

				escibo.write(escibiendo.charAt(i));
			}
			escibo.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

class buffer {
	public buffer() {
		try {
			FileReader Leer = new FileReader("C:/Users/DIOS/Desktop/Nuevo documento de texto.txt");

			BufferedReader mibufer = new BufferedReader(Leer);

			String linea = "";

			while (linea != null) {

				linea = mibufer.readLine();

				if (linea != null)

					System.out.println(linea);

			}

			Leer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
