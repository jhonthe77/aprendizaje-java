package aprendisaje_avamzado;

import javax.swing.*;

public class Dispocicion_muelle extends JFrame {
	public Dispocicion_muelle() {
		setTitle(" Dispocion muelle");

		setVisible(true);
		setBounds(600, 250, 400, 300);
		SpringLayout mi_layout = new SpringLayout();
		

		setLayout(mi_layout);
		Spring mi_muelle = Spring.constant(0, 10, 100);

		JButton boton = new JButton("cerrar");
		JButton boton1 = new JButton("Abrir");
		JButton boton2 = new JButton("minimizar");

		add(boton);
		add(boton1);
		add(boton2);

		

		mi_layout.putConstraint(SpringLayout.WEST, boton, mi_muelle, SpringLayout.WEST, this);

		mi_layout.putConstraint(SpringLayout.WEST, boton1, mi_muelle, SpringLayout.EAST, boton);

		mi_layout.putConstraint(SpringLayout.WEST, boton2, mi_muelle, SpringLayout.EAST, boton1);

		//mi_layout.putConstraint(SpringLayout.EAST, this, mi_muelle, SpringLayout.EAST, boton2);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}
