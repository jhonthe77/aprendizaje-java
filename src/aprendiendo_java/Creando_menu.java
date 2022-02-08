package aprendiendo_java;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class Creando_menu extends JFrame {
	public Creando_menu() {
		// TODO Auto-generated constructor stub
		setBounds(400, 200, 450, 250);
		setTitle("creando menu");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new panel1());
	}
class panel1 extends JPanel{
	public panel1() {
		// TODO Auto-generated constructor stub
		JPopupMenu menu = new JPopupMenu();
		JMenuItem opcion1 = new JMenuItem("opcion 1");
		menu.add(opcion1);
		setComponentPopupMenu(menu);
	}
}
}
