package aprendiendo_java;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class modifican_lamina extends JFrame {

	public modifican_lamina() {
		// TODO Auto-generated constructor stub
		setBounds(300, 200, 600, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new Lamin());

	}

}

class Lamin extends JPanel implements FocusListener {
	

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub

		setLayout(null);
		cuadro = new JTextField();
		cuadro1 = new JTextField();
		cuadro.setBounds(120, 10, 150, 20);
		cuadro1.setBounds(120, 50, 150, 20);
		
		add(cuadro);
		add(cuadro1);
		super.paint(g);
		cuadro1.addFocusListener(this);
		
	}

	JTextField cuadro;
	JTextField cuadro1;

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("no correto");
		
		String email = cuadro1.getText();
		boolean comprobar = false;

		for (int i = 0; i < email.length(); i++) {

			if (email.charAt(i) == '@') {
				comprobar = true;
			}

		}
		if (comprobar) {
			System.out.println("es correto");
		} else {
			System.out.println("no correto");
		}

	}

}