package aprendisaje_avamzado;

import java.io.*;


public class Leeryescrtibir_byte {
	public static void main(String[] args) {

		int byte1 = 0;

		int bite_imagen[] = new int[3488328];

		try {
			FileInputStream racvhivo = new FileInputStream(
					"C:/Users/GOD AND JHON/Desktop/mascara-de-anonimo-en-colores-verde-neon_3840x2160_xtrafondos.com.jpg");

			boolean archivo_f = false;
			while (!archivo_f) {

				int archivo_f1 = racvhivo.read();

				if (archivo_f1 != -1)

					bite_imagen[byte1] = archivo_f1;

				else
					archivo_f = true;

				System.out.println(bite_imagen[byte1]);
				byte1++;

			}
			
			racvhivo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(byte1);

		copia_imagen(bite_imagen);
	}

static void copia_imagen(int datos[]) {
	
	try {
		FileOutputStream Nv_imagen = new FileOutputStream("C:/Users/GOD AND JHON/Desktop/mascara-de-anonimo-en-colores-verde-neon_3840x2160_xtrafondos.com124.jpg");
	for (int i = 0; i < datos.length; i++) {
		
		try {
			Nv_imagen.write(datos[i]);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	Nv_imagen.close();
		
	} catch (IOException e) {
		e.printStackTrace();
			
		}
	}
}



