package aprendiendo_java;

import java.awt.event.*;

import javax.swing.*;

public class Multiples_oyentes {

}

/*
 * esta es una clase que me permite crear varias ventanas con un boton y ala vez me permite cerrarlas todas desde un solo b
 * boton*/

class Marco_referencia extends JFrame {// creo un marco referencia que tendra la lamina o pnale pricipal
	public Marco_referencia() {

		setBounds(300, 200, 400, 350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new Lmina_principal());
	}
}

class Lmina_principal extends JPanel {// creo una lamina y le agreog los botones que realizaran las funciones principales 
	public Lmina_principal() {

		JButton Boton_nuevo = new JButton("nuevo");
		add(Boton_nuevo);
		Boton_cerrar = new JButton("cerrar todo");
		add(Boton_cerrar);
		Clase_oyente oye = new Clase_oyente();
		Boton_nuevo.addActionListener(oye);
	}
	
	private class Clase_oyente implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			Ventanas_emegerten ventanas_visibel= new Ventanas_emegerten(Boton_cerrar);
			ventanas_visibel.setVisible(true);
		}
	
	}

	JButton Boton_cerrar;
}


 class Ventanas_emegerten extends JFrame{// creo una clase para crear nuevas ventanas 

	
	public Ventanas_emegerten(JButton Cerrar_todo) {
		 contador++;
		setTitle("ventana" + contador);
		setBounds(contador*40, contador*40, 250, 250);
		oyente_cerrar_todo cierraT = new oyente_cerrar_todo();
		Cerrar_todo.addActionListener(cierraT);
	}
	
	private class oyente_cerrar_todo implements ActionListener{// clase que resive la acion del boton cerrar quien implementa la interfas ActionListener

		@Override
		public void actionPerformed(ActionEvent e) { // metodo que pertenece ala interfas y captura los diferentes eventos
			// TODO Auto-generated method stub
			dispose();// metodo para cerrar todas las ventans 
			
		}
		
	}
	 private static int contador; // variable estatica es decir que la comparten todas las ventanas que realize para enumerarlas 
	
	
	
}