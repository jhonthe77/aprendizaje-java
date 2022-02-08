package soker;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;

public class Cliente {

	public static void main(String[] args) {

		MarcoCliente mimarco = new MarcoCliente();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

@SuppressWarnings("serial")
class MarcoCliente extends JFrame {

	public MarcoCliente() {

		setTitle("--- CHAT JHON----- ");

		setBounds(600, 300, 280, 350);

		LaminaMarcoCliente milamina = new LaminaMarcoCliente();

		add(milamina);

		setVisible(true);

		deteta_online detetar = new deteta_online();

		addWindowListener(detetar);
	}

}

//-----------------------ENVIAR ESTADO DE QUE ESTOY EN LINEA-----------------------------------------------------------------

class deteta_online extends WindowAdapter {

	public deteta_online() {

	}

	public void windowOpened(WindowEvent e) {

		try {

			enviar_mensajes mensaje_online = new enviar_mensajes();

			Socket envia_señal_online = new Socket("192.168.0.101", 8080);

			ObjectOutputStream mensajero_online = new ObjectOutputStream(envia_señal_online.getOutputStream());

			mensaje_online.setMesaje_usario("online");

			mensajero_online.writeObject(mensaje_online);

			envia_señal_online.close();

		} catch (UnknownHostException e1) {

			System.out.println(" no coneto");

		} catch (IOException e1) {

			System.out.println(" no coneto 2");
		}

	}

}

//------------------------------FIN----------------------------------------------------------------------------------------------------

//-------------- CLASE ENCARGADA DE ENVIAR  Y RESIVIR ARCHIVOS DEL LA APLICACION CLIENTE----------------------------------------------------

@SuppressWarnings("serial")
class LaminaMarcoCliente extends JPanel implements Runnable {

	public LaminaMarcoCliente() {

		setPreferredSize(new Dimension(400, 400));

		String Nikusuario = JOptionPane.showInputDialog("¡ESCRIBA SU NOMBRE!");

		JLabel nik_user = new JLabel("NIK: ");

		add(nik_user);

		usuario = new JLabel();

		usuario.setText(Nikusuario);

		add(usuario);

		JLabel texto = new JLabel("online");

		add(texto);

		usuarios = new JComboBox<String>();

		add(usuarios);

		campochat = new JTextArea(10, 20);

		campochat.setLineWrap(true);

		campochat.setWrapStyleWord(true);

		chat = new JScrollPane(campochat, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		add(chat, campochat);

		campo1 = new JTextArea(2, 20);

		campo1.setLineWrap(true);

		campo1.setWrapStyleWord(true);

		enniar = new JScrollPane(campo1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		add(enniar, campo1);

		miboton = new JButton("Enviar");

		miboton.addActionListener(new enviar_archivos());

		add(miboton);

		Thread mensaje_servidor = new Thread(this);

		mensaje_servidor.start();

	}

	private JScrollPane chat, enniar;
	private JComboBox<String> usuarios;
	private JTextArea campo1;
	private JLabel usuario;
	private JTextArea campochat;
	private JButton miboton;

	private class enviar_archivos implements ActionListener {

		public enviar_archivos() {

		}

		public void actionPerformed(ActionEvent e) {

			campochat.append("\n" + campo1.getText());

			try {

				Socket arcivos = new Socket("192.168.0.101", 8080);

				enviar_mensajes enviar_archivosU = new enviar_mensajes();

				ObjectOutputStream enviar_arcivos = new ObjectOutputStream(arcivos.getOutputStream());

				enviar_archivosU.setMesaje_usario(campo1.getText());

				enviar_archivosU.setNik(usuario.getText());

				enviar_archivosU.setIpe((String) usuarios.getSelectedItem());

				enviar_arcivos.writeObject(enviar_archivosU);

				campo1.setText("");

				campo1.getText();

				arcivos.close();

			} catch (IOException e1) {

				System.out.println(" no coneto 3");
			}

		}

	}

	@SuppressWarnings("resource")
	public void run() {
		try {

			ServerSocket Archivos_resividos = new ServerSocket(1000);

			enviar_mensajes servidor = new enviar_mensajes();

			ArrayList<String> ipmenut = new ArrayList<String>();

			while (true) {

				Socket archivos_server = Archivos_resividos.accept();

				ObjectInputStream servidor_cliente = new ObjectInputStream(archivos_server.getInputStream());

				servidor = (enviar_mensajes) servidor_cliente.readObject();

				String nit, mensaje, ip;

				if (!servidor.getMesaje_usario().equals("online")) {

					nit = servidor.getNik();

					mensaje = servidor.getMesaje_usario();

					ip = servidor.getIpe();

					campochat.append("\n" + nit + " : " + mensaje + " " + ip);

					archivos_server.close();

					System.out.println("x4");
				} else {

					System.out.println("x5");

					ipmenut = servidor.getIps();

					usuarios.removeAllItems();

					for (String D : ipmenut) {

						usuarios.addItem(D);

					}

				}
			}

		} catch (Exception e) {

			System.out.println(" no coneto 4");
		}

	}
}

//----------------------------------------FIN---------------------------------------------------------------------------------------------

//---------------CLASE CONSTRUTORA DE LOS PAQUETES QUE SE ENVIAN-------------------------------------------------------------------------

@SuppressWarnings("serial")
final class enviar_mensajes implements Serializable {

	private FileInputStream arcivos_entrada;

	private FileOutputStream rachi_salida;

	private String mesaje_usario;

	private ArrayList<String> ips;

	private String ipe;

	private String Nik;

	public FileInputStream getArcivos_entrada() {
		return arcivos_entrada;
	}

	public void setArcivos_entrada(FileInputStream arcivos_entrada) {
		this.arcivos_entrada = arcivos_entrada;
	}

	public FileOutputStream getRachi_salida() {
		return rachi_salida;
	}

	public void setRachi_salida(FileOutputStream rachi_salida) {
		this.rachi_salida = rachi_salida;
	}

	public String getNik() {
		return Nik;
	}

	public void setNik(String nik) {
		Nik = nik;
	}

	public String getMesaje_usario() {
		return mesaje_usario;
	}

	public void setMesaje_usario(String mesaje_usario) {
		this.mesaje_usario = mesaje_usario;
	}

	public ArrayList<String> getIps() {
		return ips;
	}

	public void setIps(ArrayList<String> ips) {
		this.ips = ips;
	}

	public String getIpe() {
		return ipe;
	}

	public void setIpe(String ipe) {
		this.ipe = ipe;
	}

}

//----------------------------------------FIN---------------------------------------------------------------------------------------------