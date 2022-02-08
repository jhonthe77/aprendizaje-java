package aprendisaje_avamzado;

import java.awt.BorderLayout;

import javax.swing.*;



public class Dispocicones_avanzadas {
	public Dispocicones_avanzadas() {
		
		
		// TODO Auto-generated constructor stub
		//frame_avanzada jk = new frame_avanzada();
		//Dispocicion_muelle mn = new Dispocicion_muelle();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dispocicones_avanzadas kj = new Dispocicones_avanzadas();
		//Arreglos nh = new Arreglos();
	}

	private class frame_avanzada extends JFrame {
		public frame_avanzada() {
			// TODO Auto-generated constructor stub
			setBounds(600, 250, 400, 300);

			JLabel usuario = new JLabel(" Usuario");
			JTextField texto1 = new JTextField(10);
			texto1.setMaximumSize(texto1.getPreferredSize());
			
			Box caja1 = Box.createHorizontalBox();
			caja1.add(usuario);
			caja1.add(Box.createHorizontalStrut(10));
			caja1.add(texto1);

			Box caja2 = Box.createHorizontalBox();

			JLabel contraseña = new JLabel(" contraseña");
			JTextField texto2 = new JTextField(10);
			texto2.setMaximumSize(texto2.getPreferredSize());
			caja2.add(contraseña);
			caja2.add(Box.createHorizontalStrut(10));
			caja2.add(texto2);
			
			Box caja3 = Box.createHorizontalBox();
		    
			JButton boto1 = new JButton("ok");
			JButton boto2 = new JButton("cerrar");
			caja3.add(boto1);
			caja3.add(Box.createGlue());
			caja3.add(boto2);
			
			Box cajaVertical = Box.createVerticalBox();
			
			cajaVertical.add(caja1);
			cajaVertical.add(caja2);
			cajaVertical.add(caja3);
			
			add(cajaVertical, BorderLayout.CENTER);
			

			setTitle(" usuario");
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);

		}
	}
}
