package practicaSemana4;

public abstract class Volador1 {
	
	
	protected String nombre; 

	public Volador1(String nombre) {
		this.nombre = nombre; 
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Volador1 [nombre=" + nombre + "]";
	}

}
