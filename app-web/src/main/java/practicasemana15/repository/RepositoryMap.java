package practicasemana15.repository;

import java.util.HashMap;
import java.util.Map;

import practicasemana15.Formulario;

public class RepositoryMap {

	private static Map<Long,Formulario> mapa = new HashMap<>();

	public static void addFormulario(Formulario form) {
		mapa.put(form.getDocumento(), form);
	}

	public static Formulario getFormulario(Long documento) {
		Formulario formEncontrado = mapa.get(documento);
		return formEncontrado;
	}

	public static Map<Long,Formulario> getMapa() {
		return mapa;
	}
}