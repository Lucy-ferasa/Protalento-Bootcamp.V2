package practicaSemana4;

public class Helicoptero1 extends Volador1 implements Aterrizable1{

	
	private int cantidadPasajeros; 
	private String tipoHelicoptero; 
	private String color; 

	public Helicoptero1(String nombre, int cantidadPasajeros, String tipoHelicoptero, String color) {
		super(nombre);
		this.cantidadPasajeros = cantidadPasajeros; 
		this.tipoHelicoptero = tipoHelicoptero; 
		this.color = color; 

	}

	public void aterrizar() {
		System.out.println("El Helicóptero se encuentra autorizado para aterrizar");

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCantidadPasajeros() {
		return cantidadPasajeros;
	}

	public String getTipoHelicoptero() {
		return tipoHelicoptero;
	}

}
