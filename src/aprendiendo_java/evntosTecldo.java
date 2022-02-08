package aprendiendo_java;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class evntosTecldo implements KeyListener{
	 public evntosTecldo() {
	 
		// TODO Auto-generated constructor stub
		 //ventan vtm = new ventan();
		

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int cd = e.getKeyCode();
		char cdg =e.getKeyChar();
		System.out.println(cd + " " + cdg);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		char jk =e.getKeyChar();
		System.out.println(jk);
	}

}
class ventan extends JFrame{
	
	public ventan() {
		setBounds(300, 200, 400, 250);
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		evntosTecldo codigo = new evntosTecldo();
		addKeyListener(codigo);
		
	}
}
