package practicaSemana9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class DatosDBMemoria {

	private Set<Inscripcion> inscrip = new HashSet<>();
	
	public void agregarInscripcion(Inscripcion inscripcion) {
		inscrip.add(inscripcion);
	}
	
	public boolean buscar(Long idInscripcion) {
		Iterator<Inscripcion> iInscripcion = inscrip.iterator();
		int repeticiones = 0;
		boolean encontro = false;
		while(iInscripcion.hasNext()) {
			Inscripcion inscripTemp = iInscripcion.next();
			if(inscripTemp.getIdInscripcion() == idInscripcion) {
				repeticiones++;
			}
		}
		if(repeticiones != 0) {
			encontro = true;
		}
		return encontro;
	}

	public void borrarInscripcion(Long idInscripcion) {
		Iterator<Inscripcion> iInscripcion = inscrip.iterator();
		while(iInscripcion.hasNext()) {
			Inscripcion inscripTemp = iInscripcion.next();
			if(inscripTemp.getIdInscripcion() == idInscripcion) {
				iInscripcion.remove();
			}
		}
		
	}

	public void buscarInscripcion(Long idInscripcion) {
		Iterator<Inscripcion> iInscripcion = inscrip.iterator();
		while(iInscripcion.hasNext()) {
			Inscripcion inscripTemp = iInscripcion.next();
			if(inscripTemp.getIdInscripcion() == idInscripcion) {
				System.out.println(inscripTemp);
			}
		}
		
	}

}
