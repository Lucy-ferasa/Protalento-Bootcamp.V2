package practicaSemana11;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Persona {

	private IIdioma idiomaNativo;
	private Set<IIdioma> otros;

	private Map<Class, IIdioma> idiomas; 

	private String nombre;
	private String apellido;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Persona(String nombre, String apellido, IIdioma idiomaNativo) {	
		this.nombre = nombre;
		this.apellido = apellido;
		this.idiomaNativo = idiomaNativo;

		this.otros = new HashSet<IIdioma>();
		this.idiomas = new HashMap<Class, IIdioma>();

		idiomas.put(idiomaNativo.getClass(),idiomaNativo);
	}

	//puede apredender un nuevo idioma
	public void aprender(IIdioma nuevoIdioma) {
		//nulo
		if(nuevoIdioma == null) {
			throw new RuntimeException("idioma invalido o nulo");
		}

		if(otros.contains(nuevoIdioma)) {
			throw new RuntimeException("IDIOMA YA APRENDIDO");
		}

		this.aprenderIdioma(nuevoIdioma);		
	}

	public void decir() {
		Collection<IIdioma> idiomas = this.obtenerIdiomas();
		for(IIdioma idioma : idiomas) {
			idioma.decir();
		}
	}

	public void decirEn(IIdioma idioma) {
		//¿como valido?
		//mapa?
		if(this.idiomas.containsKey(idioma.getClass())) {
			IIdioma idiomaAux =  this.idiomas.get(idioma.getClass());
			idiomaAux.decir();
		}else {
			throw new RuntimeException(this.nombre + " no habla " + idioma.getClass().getSimpleName());
		}
	}

	private Collection<IIdioma> obtenerIdiomas() {
		return this.idiomas.values();
	}

	private void aprenderIdioma(IIdioma nuevoIdioma) {
		//logica adicional
		this.otros.add(nuevoIdioma);
		this.idiomas.put(nuevoIdioma.getClass(), nuevoIdioma);
	}

	public Object getIdiomaNativo() {
		return null;
	}

	public Collection<IIdioma> getIdiomasAprendidos() {
		return null;
	}

	public void saludarEn(IIdioma iIdiomaAHablar) {
			
	}

	public void presentarseEn(IIdioma iIdiomaAHablar) {
		
	}

	public void despedirseEn(IIdioma iIdiomaAHablar) {
		
	}

}