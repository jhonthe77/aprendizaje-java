package soker;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.*;

public class Servidor {

	public static void main(String[] args) {

		MarcoServidor mimarco = new MarcoServidor();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

@SuppressWarnings("serial")
class MarcoServidor extends JFrame implements Runnable {

	public MarcoServidor() {

		setTitle("--- CHAT JHON----- ");

		setBounds(600, 500, 280, 350);

		JPanel milamina = new JPanel();

		milamina.setLayout(new BorderLayout());

		areatexto = new JTextArea();

		milamina.add(areatexto, BorderLayout.CENTER);

		add(milamina);

		setVisible(true);

		Thread Hilo_detetar_online = new Thread(this);

		Hilo_detetar_online.start();

	}

	private JTextArea areatexto;

	@SuppressWarnings("resource")
	public void run() {

		try {

			ServerSocket entrada_datos = new ServerSocket(8080);

			enviar_mensajes online = new enviar_mensajes();

			String online_user, mensaje, nit, ip;

			ArrayList<String> listaip = new ArrayList<String>();

			while (true) {

//-----------------DETETA QUIEN SE CONETO--------------------------------------------------------------------------------

				Socket datos_resividos = entrada_datos.accept();

				ObjectInputStream mensaje_user = new ObjectInputStream(datos_resividos.getInputStream());

				online = (enviar_mensajes) mensaje_user.readObject();

				nit = online.getNik();

				mensaje = online.getMesaje_usario();

				ip = online.getIpe();

				if (!online.getMesaje_usario().equalsIgnoreCase("online")) {

					System.out.println("estoy aqui");

					areatexto.append("\n" + nit + "  " + mensaje + " " + ip);

					Socket datos_reenvio = new Socket(ip, 1000);

					ObjectOutputStream datos_renvio = new ObjectOutputStream(datos_reenvio.getOutputStream());

					datos_renvio.writeObject(online);

					datos_reenvio.close();

					datos_resividos.close();

				} else {

					System.out.println("estoy aqui x2");

					InetAddress localizacion = datos_resividos.getInetAddress();

					online_user = localizacion.getHostAddress();

					online.setIps(listaip);

					listaip.add(online_user);

					for (String D : listaip) {

						System.out.println("estoy aqui x3");

						System.out.println(D);

						Socket ip_online = new Socket(D, 1000);

						ObjectOutputStream usuario_online = new ObjectOutputStream(ip_online.getOutputStream());

						usuario_online.writeObject(online);

						datos_resividos.close();

						usuario_online.close();

						ip_online.close();

					}

				}
				// entrada_datos.close();
//----------------------------DETECTA LA DIRECION IP QUE SE A CONECTADO------------------------------------------------------------		

			}
//--------------------------------------------------------------------------------------------------------------------------				

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
