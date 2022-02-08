package aprendiendo_java;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/*
 * enesta clase creo una calculadora utilizando la clase GridLayout y colocando en practica algunos conocimientos
 * que ya se tienen 
 */

public class Grid_layouts_caculadora {

}

class ventana_calculadora extends JFrame {

	public ventana_calculadora() {

		setBounds(200, 150, 350, 250);
		setVisible(true);
		setTitle("ventana calculadora hecha por jhon ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new lamina_calculadora());
		// pack();
	}
}

class lamina_calculadora extends JPanel {

	public lamina_calculadora() {
		// TODO Auto-generated constructor stub
		principio = true;
		setLayout(new BorderLayout());// aqui  al metodo BorderLayout que pertenece ala clase setLayout lo llamo
		pantalla = new JButton("0");// creo un boton pantalla
		pantalla.setEnabled(false);// AQUI dejo el boton inativo para que no se pueda presionar para simular una pantalla 
		add(pantalla, BorderLayout.NORTH); // aqui  pongo en la parte superiro de la pantalla con al metodo BorderLayout.NORTH

		lami2 = new JPanel();// CREO otra lamina
		lami2.setLayout(new GridLayout(4, 4));// a la lamina nueva le implemento o llamo al metodo GridLayout para crear una cuadricula para los botones 
		ActionListener insertar = new accion_eventos();

		ActionListener opera = new Operaciones();

		boton("7", insertar);
		boton("8", insertar);
		boton("9", insertar);
		boton("/", opera);
		boton("4", insertar);
		boton("5", insertar);
		boton("6", insertar);// creo botones por medio de un metodo para optimizar codigo  para la cuadricula anterior que cree con el metodo GridLayout 
		boton("*", opera);
		boton("1", insertar);
		boton("2", insertar);
		boton("3", insertar);
		boton("-", opera);
		boton(".", insertar);
		boton("0", insertar);
		boton("=", opera);
		boton("+", opera);
		add(lami2, BorderLayout.CENTER); // aqui addato los botenes ala lamina con las cuadriculas 
		ultima_operacion = "=";

	}

	private void boton(String rotulo, ActionListener oyente) {// creo un metodo para crear los botones anteriormente vistos el cual resive dos parametros un nombre y un evento 

		JButton boton = new JButton(rotulo);// creo el boton preparado para que rsiva un nombre
		boton.addActionListener(oyente);// y aqui le agrgo el evento  que genera la interfas ActionListener 
		lami2.add(boton);// y aqui llamo al objeto de la lamina para que  addate el boton creado es desir que cada boton que genere el metodo de agregue al dicha lamina 
	}

	private class accion_eventos implements ActionListener {// creo una clase interna para que implemente la interfas ActionListener para controlar los evento que se crearan
		public accion_eventos() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public void actionPerformed(ActionEvent e) {// este es un metodo que estamos obligados a implementar por la interfas para catura los eventos 
			// TODO Auto-generated method stub
			String entrada = e.getActionCommand();// creo una variable  para catura la operaracio que el usuario alla presionado con el metodo getActionComand el cual catura el texto del objeto precionado  

			if (principio) { // cre una condicion para  resetear la pantalla  con una variable globa para booleana 

				pantalla.setText("");// aqui se refleja la condicio colocando el boton pantalla en blanco o sin carater alguna
				principio = false;
			}
			pantalla.setText(pantalla.getText() + entrada);// al objeto pantalla o boton  con el metodo setText que premite agregrar texto a un ojeto le implemtento el carater escojido por el usuario para que lo muestre  
			//  ya teniendo el texto lo en pantalla lo guardo con el metodo getText y lo concateno con el nuevo valor 
			

		}

	}

	class Operaciones implements ActionListener {
		public Operaciones() {

		}

		@Override
		public void actionPerformed(ActionEvent e) {

			String operacion = e.getActionCommand();
			calcular(Double.parseDouble(pantalla.getText()));
			ultima_operacion=operacion;
			principio = true;
		}

	}

	private void calcular(double oparcion) {

		if (ultima_operacion.equals("+")) {

			resultado += oparcion;
		} else if (ultima_operacion.equals("-")) {
			resultado -= oparcion;
		} else if (ultima_operacion.equals("*")) {
			resultado *= oparcion;
		} else if (ultima_operacion.equals("/")) {
			resultado /= oparcion;
		} else if (ultima_operacion.equals("=")) {
			resultado = oparcion;
		}
		
		pantalla.setText( "" + resultado);
	}

	private JButton pantalla;

	private JPanel lami2;

	private boolean principio;

	private double resultado;

	private String ultima_operacion;
}
