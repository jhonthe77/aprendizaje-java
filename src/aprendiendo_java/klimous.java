package aprendiendo_java;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class klimous extends MouseAdapter implements MouseMotionListener {

	public klimous() {
 
	 
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		super.mouseMoved(e);
		JOptionPane.showInternalMessageDialog(null, "te estas moviendo");
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		super.mouseDragged(e);
		// System.out.println("has presionado" );
		// JOptionPane.showInternalMessageDialog(null, "has presionado");
	}

	@Override
	public void mousePressed(MouseEvent k) {
		// TODO Auto-generated method stub

		System.out.println("has presionado" + " " + k.getModifiersEx());
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

		System.out.println("hiciste clik" + " " + e.getX() + " " + e.getY() + " " + e.getClickCount());
	}

}

class ventan45 extends JFrame {
	public ventan45() {
		
		
		// TODO Auto-generated constructor stub
		setBounds(300, 200, 400, 250);
		setVisible(true);
		klimous bn = new klimous();
		klimous kj = new klimous();
		addMouseMotionListener(kj);
		addMouseListener(bn);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}