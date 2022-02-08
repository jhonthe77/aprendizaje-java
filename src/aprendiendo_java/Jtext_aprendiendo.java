package aprendiendo_java;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;


public class Jtext_aprendiendo extends JFrame {
	public Jtext_aprendiendo() {

		setBounds(600, 250, 400, 350);

		setTitle("modificando texto");

		add(new lmn1());

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
}

class lmn1 extends JPanel {
	public lmn1() {

		setLayout(new FlowLayout());
		add(new JButton("comprobar"), BorderLayout.CENTER);
		JTextField tex1 = new JTextField(12);
		escucha_texto oyente = new escucha_texto();
		Document jk =tex1.getDocument();
		jk.addDocumentListener(oyente);
		
		add(tex1, BorderLayout.CENTER);

	}


     class escucha_texto implements DocumentListener{

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println(" has intruducido texto");
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("has borarado texto");
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
    	 
     }



}
