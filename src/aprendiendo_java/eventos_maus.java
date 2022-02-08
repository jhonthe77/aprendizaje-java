package aprendiendo_java;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class eventos_maus extends MouseAdapter{
	
	public eventos_maus() {
		// TODO Auto-generated constructor stub
		
	}
	@Override
	public void mousePressed(MouseEvent k) {
		// TODO Auto-generated method stub
		
		System.out.println("has presionado");
	}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
	System.out.println("hiciste clik");
}



}
class ventan4 extends JFrame {
	public ventan4() {
		// TODO Auto-generated constructor stub
		setBounds(300, 200, 400, 250);
		setVisible(true);
		klimous bn = new klimous();
		addMouseListener(bn);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}