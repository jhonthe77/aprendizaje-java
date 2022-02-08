package aprendisaje_avamzado;

import java.util.*;

public class Coleciones_set {

	/*
	 * tipo de clases de coleciones: Set, List, Map, SortedSet, SortedMap, HashSet, TreeSet,
	 * ArrayList, LinkedList, Vector, Collections, Arrays, AbstractCollection
	 * 
	 * utilizidas para crear una colecion de dados
	 */

	public static void main(String[] args) {

		HashMap<String, carro> carro1 = new HashMap<String, carro>();

		carro1.put("141", new carro("Mazda"));

		carro1.put("142", new carro("Porche"));

		carro1.put("143", new carro("Chebrolet"));

		System.out.println(carro1);

	}

}

class carro {
	public carro(String nombre) {
		this.nombre = nombre;
		N_lantas = 4;
		Peso = 500;
		plataforma = 2000;

	}

	public String toString() {

		return "Nombrer es = " + nombre + " cantida de llantas: " + N_lantas + " y el peso es de " + Peso + " Kg"
				+ " y tine una pltaforma con " + plataforma + " cm";

	}

	private int N_lantas;
	private int Peso;
	private int plataforma;

	private String nombre;

}