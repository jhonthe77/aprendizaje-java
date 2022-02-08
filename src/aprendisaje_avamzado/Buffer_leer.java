package aprendisaje_avamzado;

import java.io.*;

public class Buffer_leer {
	
	bufer nb = new bufer();
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Buffer_leer jk = new Buffer_leer();
	
		
	}
	
	class bufer{
		@SuppressWarnings("null")
		public bufer() {
			
			try {
				FileReader texto_grande = new FileReader("C:/Users/DIOS/Desktop/ty.txt");
				
				BufferedReader texto = new BufferedReader(texto_grande);
				String linea = "";
				
				while (texto!=null) {
					
					linea = texto.readLine();
					if(linea!=null)
					
					System.out.println(linea);
				}
				 texto_grande.close();
				 texto.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	
	
}



