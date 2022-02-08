package aprendiendo_java;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;

import jdk.security.jarsigner.JarSigner;

public class Trabajar_chebok extends JFrame {
	public Trabajar_chebok() {

		setBounds(600, 200, 500, 350);
		setLayout(new BorderLayout());
		setTitle("chebok");
		JButton JButton1;
		add(new Chesb(), BorderLayout.SOUTH);
		add(new JScrollPane(new JTextArea(20,20  )),BorderLayout.WEST);
		add(new JScrollPane(new JTextArea(20,20  )),BorderLayout.EAST);
		add(new lamina_1() , BorderLayout.WEST);
		add(new lamiana_chet());
		
		add(JButton1 = new JButton("contador"), BorderLayout.NORTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	private class Chesb extends JPanel {
		public Chesb() {
		

			add(new JButton("chek b"));

		}
	}
private class lamiana_chet extends JPanel{
	public lamiana_chet() {
		// TODO Auto-generated constructor stub
	
		JSlider menu = new JSlider(0,200,100);
		menu.setMajorTickSpacing(50);
	
		menu.setPaintTicks(true);
		
		
		menu.setPaintLabels(true);
		menu.setMinorTickSpacing(10);
		add(new JCheckBox("si") );
		add(new JCheckBox("no"));
		add(new JCheckBox("si y no"));
	
		
		add(menu);
		
	}
}
 private class lamina_1 extends JPanel{
	 public lamina_1() {
		// TODO Auto-generated constructor stub
		 JRadioButton bontonr1 = new JRadioButton("bueno" , true);
		 JRadioButton bontonr2= new JRadioButton("cierto" , false );
		 JRadioButton bontonr3 = new JRadioButton("falso" , false);
		 ButtonGroup migrupo = new ButtonGroup();
		 migrupo.add(bontonr1);
		 migrupo.add(bontonr2);
		 migrupo.add(bontonr3);
		 add(bontonr1);
		 add(bontonr2);
		 add(bontonr3);
		 
	}
 }

}