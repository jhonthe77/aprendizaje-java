package aprendiendo_java;

import java.awt.*;

import javax.swing.*;

public class flow_Layouts_utilizar {

}

class Ventana_layouts extends JFrame {
	public Ventana_layouts() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setBounds(200, 250, 400, 350);
		setTitle("ventana la modificacion layouts");
		setVisible(true);

		lamina_layouts lmy = new lamina_layouts();
		// FlowLayout posicion = new FlowLayout(FlowLayout.LEFT);// construtor con la
		                                                         // posicion como parametro

		// lmy.setLayout(posicion);

		lmy.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 60));// construto con la posicio como parameto y tambien la
																	// separacion de los componentes en x i en y
		add(lmy);
	}
}

class lamina_layouts extends JPanel {
	public lamina_layouts() {

		JButton AMARILO = new JButton("Amarillo");
		add(AMARILO);

		add(new JButton("Azul"));
		add(new JButton("Rojo"));

	}
}