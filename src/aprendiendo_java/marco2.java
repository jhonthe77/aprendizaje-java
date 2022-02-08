package aprendiendo_java;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class marco2 extends JFrame {
	
	 public marco2() {
		setBounds(300, 200, 400, 250);
		setVisible(true);
	 M_ventana oyente_ventana = new M_ventana();
	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addWindowListener(oyente_ventana);
		// TODO Auto-generated constructor stub
	}
		

	}
class M_ventana extends WindowAdapter{

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ventana abierta");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		
		System.out.println("ventana cerrada");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ventana a");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
		System.out.println("ventana minimizada");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ventana restaruda");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		
		System.out.println("ventana ativa");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ventana desativa");
	}
	
}




