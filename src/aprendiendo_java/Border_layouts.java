package aprendiendo_java;



import java.awt.*;


import javax.swing.*;

 class Border_layouts extends JFrame {
	public Border_layouts() {
		
		setBounds(200, 150, 800, 500);
		setVisible(true);
		setTitle("clase border layouts");
		setDefaultCloseOperation(EXIT_ON_CLOSE);


		LMN1_layouts lm = new LMN1_layouts();
		Lmn_layouts mn = new Lmn_layouts();
	
		add(lm,BorderLayout.NORTH);
		add(mn,BorderLayout.SOUTH);
		

		
		

	
		
	}

}

class LMN1_layouts extends JPanel {
	public LMN1_layouts() {

		setLayout(new BorderLayout(10, 10));
		add(new JButton("bordes") , BorderLayout.NORTH);
		add(new JButton("bordes1") , BorderLayout.CENTER);
		add(new JButton("bordes2") , BorderLayout.SOUTH);
		/*
		add(new JButton("bordes3") , BorderLayout.CENTER);
		add(new JButton("bordes4") , BorderLayout.EAST);
*/
	}
}

class Lmn_layouts extends JPanel {

	public Lmn_layouts() {

		setLayout(new FlowLayout(FlowLayout.CENTER));

		add(new JButton("borde"));
		add(new JButton("bordes2"));
	}
}











