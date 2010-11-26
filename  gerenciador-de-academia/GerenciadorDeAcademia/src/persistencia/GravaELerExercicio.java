package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import projeto.Exercicio;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class GravaELerExercicio implements Serializable{
	private static final transient long serialVersionUID = 1L;
	private static final String xmlExercicio = "exercicio.xml";
	private static XStream xstream = new XStream();
	private static XStream xstream2 = new XStream(new DomDriver());

	public static void gravaExercicio(List<Exercicio> listaDeExercicio) throws IOException {
		BufferedWriter writer1 = null;

		try {
			writer1 = new BufferedWriter(new FileWriter(xmlExercicio));
			String listaUsuario = xstream.toXML(listaDeExercicio);
	        writer1.write(listaUsuario);

		} catch (IOException e1) {
			//System.err.println(e1);
		} finally {
			writer1.close();
		}

	}

	@SuppressWarnings("unchecked")
	public static List<Exercicio> lerUsuario(List<Exercicio> listaDeExercicios) throws IOException {
		BufferedReader read1 = null;
		List<Exercicio> listaExercicio = null;
		try {
			read1 = new BufferedReader(new FileReader(xmlExercicio));
			listaExercicio = (List<Exercicio>) xstream2.fromXML(read1);

		} catch (IOException e1) {
			//System.err.println(e1);
		} finally {
			read1.close();
		}
		return listaExercicio;
	}}