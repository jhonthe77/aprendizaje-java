package aprendiendo_java;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class estadoVentana extends JFrame{
	public estadoVentana() {
		// TODO Auto-generated constructor stub
		setBounds(300, 200, 400, 250);
		setVisible(true);
		cambioEstadov cv = new cambioEstadov();
		addWindowStateListener( cv);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
class cambioEstadov implements WindowStateListener{
	public cambioEstadov() {
		
	}

	@Override
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("la ventana ha sido macimizada");
		System.out.println(e.getNewState());
		if (e.getOldState()==0) {
			JOptionPane.showMessageDialog(null, "hola");
		}
	}
}