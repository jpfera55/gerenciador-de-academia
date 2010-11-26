package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import projeto.Administrador;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class GravaLerAdmin implements Serializable{
	private static final transient long serialVersionUID = 1L;
	private static final String xmlAdmin = "admin.xml";
	private static XStream xstream = new XStream();
	private static XStream xstream2 = new XStream(new DomDriver());

	public static void gravaAdmin(List<Administrador> listaDeAdministrador) throws IOException {
		BufferedWriter writer1 = null;

		try {
			writer1 = new BufferedWriter(new FileWriter(xmlAdmin));
			String listaAdmin = xstream.toXML(listaDeAdministrador);
	        writer1.write(listaAdmin);

		} catch (IOException e1) {
			//System.err.println(e1);
		} finally {
			writer1.close();
		}

	}

	@SuppressWarnings("unchecked")
	public static List<Administrador> lerAdministrador(List<Administrador> listaDeAdministradores) throws IOException {
		BufferedReader read1 = null;
		List<Administrador> listaAdmin = null;
		try {
			read1 = new BufferedReader(new FileReader(xmlAdmin));
			listaAdmin = (List<Administrador>) xstream2.fromXML(read1);

		} catch (IOException e1) {
			//System.err.println(e1);
		} finally {
			read1.close();
		}
		return listaAdmin;
	}}