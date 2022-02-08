package aprendiendo_java;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Eventos_multiples {

}

class Marco_cambiante extends JFrame {

	public Marco_cambiante() {

		setBounds(300, 200, 400, 350);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Lamina_cambia_color laa = new Lamina_cambia_color();

		add(laa);

	}

	private class Lamina_cambia_color extends JPanel {

		public Lamina_cambia_color() {

			Accion_color Acioncolor_amarillo = new Accion_color("amarillo", Color.YELLOW);
			Accion_color Acioncolor_azul = new Accion_color("azul", Color.BLUE);
			Accion_color Acioncolor_rojo = new Accion_color("rojo", Color.RED);

			add(new JButton(Acioncolor_amarillo));
			add(new JButton(Acioncolor_azul));
			add(new JButton(Acioncolor_rojo));

			InputMap mapa_entrdra = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

			mapa_entrdra.put(KeyStroke.getKeyStroke("ctrl B"), "fondo amarillo ");

			mapa_entrdra.put(KeyStroke.getKeyStroke("ctrl A"), "fondo azul");

			mapa_entrdra.put(KeyStroke.getKeyStroke("ctrl C"), "fondo rojo ");

			ActionMap asignar = getActionMap();
			
			asignar.put("fondo amarillo", Acioncolor_amarillo);
			
			asignar.put("fondo azul", Acioncolor_azul);
			
			asignar.put("fondo rojo", Acioncolor_rojo);

		}

		private class Accion_color extends AbstractAction {

			public Accion_color(String nombre, Color color_boton) {

				putValue(NAME, nombre);
				putValue(SHORT_DESCRIPTION, "poner la lamina de color " + nombre);
				putValue("color_fondo", color_boton);
			}

			public void actionPerformed(ActionEvent e) {

				Color c = (Color) getValue("color_fondo");
				setBackground(c);

			}

		}

	}

}
