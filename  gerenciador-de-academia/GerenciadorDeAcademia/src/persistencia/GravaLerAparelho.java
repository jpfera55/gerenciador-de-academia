package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import projeto.Aparelho;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class GravaLerAparelho implements Serializable{
	private static final transient long serialVersionUID = 1L;
	private static final String xmlAparelho = "aparelho.xml";
	private static XStream xstream = new XStream();
	private static XStream xstream2 = new XStream(new DomDriver());

	public static void gravaAparelho(List<Aparelho> listaDeAparelhos) throws IOException {
		BufferedWriter writer1 = null;

		try {
			writer1 = new BufferedWriter(new FileWriter(xmlAparelho));
			String listaAparelho = xstream.toXML(listaDeAparelhos);
	        writer1.write(listaAparelho);

		} catch (IOException e1) {
			//System.err.println(e1);
		} finally {
			writer1.close();
		}

	}

	@SuppressWarnings("unchecked")
	public static List<Aparelho> lerAparelho(List<Aparelho> listaDeAparelhos) throws IOException {
		BufferedReader read1 = null;
		List<Aparelho> listaAparelho = null;
		try {
			read1 = new BufferedReader(new FileReader(xmlAparelho));
			listaAparelho = (List<Aparelho>) xstream2.fromXML(read1);

		} catch (IOException e1) {
			//System.err.println(e1);
		} finally {
			read1.close();
		}
		return listaAparelho;
	}}