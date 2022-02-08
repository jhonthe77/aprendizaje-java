package aprendiendo_java;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class aprendiendo_java {

	public static void main(String[] args) {
		//Creando_menu nm = new Creando_menu();
		
		
		//Trabajar_chebok che = new Trabajar_chebok();
		
		//Jtext_aprendiendo jt = new Jtext_aprendiendo();
		//ventana_calculadora vtc = new ventana_calculadora();
		
		//Border_layouts bn = new Border_layouts();
		
		//Ventana_layouts vnly = new Ventana_layouts();
		//Marco_referencia mrf = new Marco_referencia();
		
	   // Marco_cambiante bn = new Marco_cambiante();
		//Foco_ventana fc = new Foco_ventana();
		//fc.iniciar();		
	//modifican_lamina jk = new modifican_lamina();
		//ventan45 nm = new ventan45();
		//eventos_maus mj = new eventos_maus();
		//ventan vtm = new ventan();
		//evntosTecldo bn = new evntosTecldo();
		//estadoVentana bn = new estadoVentana();

		//CrearMarco cr = new CrearMarco();
		
		/*marco2 mr = new marco2();
		mr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco2 m = new marco2();
		m.setTitle("ventana2");
		m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		*/
	}

}

class CrearMarco extends JFrame {
	public CrearMarco() {
		setBounds(300, 200, 400, 250);
		setVisible(true);
		setTitle("evento Jbooton");
		lamina lamina1 = new lamina();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(lamina1);

	}

	

}

class lamina extends JPanel {

	JButton boton_azul = new JButton("azul");
	JButton boton_amarilla = new JButton("amarillo");
	JButton boton_rojo = new JButton("rojo");

	public lamina() {
		add(boton_amarilla);
		add(boton_rojo);
		add(boton_azul);
		color_fondo amarillo = new color_fondo(Color.YELLOW);
		color_fondo rojo = new color_fondo(Color.RED);
		color_fondo azul = new color_fondo(Color.blue);
		boton_amarilla.addActionListener(amarillo);
		boton_rojo.addActionListener(rojo);
		boton_azul.addActionListener(azul);
		
		/*
		 * }
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { // TODO Auto-generated
		 * method stub Object botonp=e.getSource();
		 * 
		 * if (botonp==boton_rojo) { setBackground(Color.red); } if(botonp==boton_azul)
		 * { setBackground(Color.BLUE); } if(botonp==boton_amarilla) {
		 * setBackground(Color.YELLOW); }
		 
		 */

	}

	class color_fondo implements ActionListener {

		public color_fondo(Color c) {
			color_fondo = c;

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			setBackground(color_fondo);
			// TODO Auto-generated method stub

		}

		private Color color_fondo;

	}

}
