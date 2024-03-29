package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import projeto.GrupoMuscular;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class GravaLerGrupoMuscular implements Serializable{
	private static final transient long serialVersionUID = 1L;
	private static final String xmlGrupo = "grupo.xml";
	private static XStream xstream = new XStream();
	private static XStream xstream2 = new XStream(new DomDriver());

	public static void gravaGrupos(List<GrupoMuscular> listaDeGrupos) throws IOException {
		BufferedWriter writer1 = null;

		try {
			writer1 = new BufferedWriter(new FileWriter(xmlGrupo));
			String listaGrupo = xstream.toXML(listaDeGrupos);
	        writer1.write(listaGrupo);

		} catch (IOException e1) {
			//System.err.println(e1);
		} finally {
			writer1.close();
		}

	}

	@SuppressWarnings("unchecked")
	public static List<GrupoMuscular> lerGrupo(List<GrupoMuscular> listaDeGrupos) throws IOException {
		BufferedReader read1 = null;
		List<GrupoMuscular> listaGrupo = null;
		try {
			read1 = new BufferedReader(new FileReader(xmlGrupo));
			listaGrupo = (List<GrupoMuscular>) xstream2.fromXML(read1);

		} catch (IOException e1) {
			//System.err.println(e1);
		} finally {
			read1.close();
		}
		return listaGrupo;
	}}
