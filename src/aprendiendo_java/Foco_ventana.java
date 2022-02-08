package aprendiendo_java;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.*;

public class Foco_ventana extends JFrame implements WindowFocusListener {
	
		public Foco_ventana() {
			// TODO Auto-generated constructor stub
		}
		
		
	public void iniciar() {
		
		marco = new Foco_ventana();
		marco2= new Foco_ventana();
		marco.setBounds(300, 400, 350, 300);
		marco2.setBounds(300, 400, 350, 300);

		marco.setVisible(true);
		marco2.setVisible(true);
		marco.setDefaultCloseOperation(EXIT_ON_CLOSE);
		marco2.setDefaultCloseOperation(EXIT_ON_CLOSE);
		marco.addWindowFocusListener(this);
		marco2.addWindowFocusListener(this);
	
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==marco) {
			marco.setTitle("tengo el foco");
			
		
		}else {
			
			marco2.setTitle("tengo elfoco");
			
		}
		
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==marco) {
			marco.setTitle("");
			
		
		}else {
			
			marco2.setTitle("");
			
		}
		
		
		
	}
 Foco_ventana marco;
 Foco_ventana marco2;
}
