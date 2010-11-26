package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import projeto.Usuario;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class GravaLerUsuario implements Serializable{
	private static final transient long serialVersionUID = 1L;
	private static final String xmlUsuario = "usuario.xml";
	private static XStream xstream = new XStream();
	private static XStream xstream2 = new XStream(new DomDriver());

	public static void gravaUsuario(List<Usuario> listaDeUsuarios) throws IOException {
		BufferedWriter writer1 = null;

		try {
			writer1 = new BufferedWriter(new FileWriter(xmlUsuario));
			String listaUsuario = xstream.toXML(listaDeUsuarios);
	        writer1.write(listaUsuario);

		} catch (IOException e1) {
			//System.err.println(e1);
		} finally {
			writer1.close();
		}

	}

	@SuppressWarnings("unchecked")
	public static List<Usuario> lerUsuario(List<Usuario> listaDeUsuarios) throws IOException {
		BufferedReader read1 = null;
		List<Usuario> listaUsuario = null;
		try {
			read1 = new BufferedReader(new FileReader(xmlUsuario));
			listaUsuario = (List<Usuario>) xstream2.fromXML(read1);

		} catch (IOException e1) {
			//System.err.println(e1);
		} finally {
			read1.close();
		}
		return listaUsuario;
	}}


