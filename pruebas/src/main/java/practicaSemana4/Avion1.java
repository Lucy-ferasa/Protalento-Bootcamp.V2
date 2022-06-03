package practicaSemana4;

public class Avion1 extends Volador1 implements Aterrizable1 {

	
	private String marca; 
	private String aerolinea; 
	private String tipodeAvion; 

	public Avion1(String nombre, String marca, String aerolinea, String tipodeAvion) {
		super(nombre);
		this.marca = marca; 
		this.aerolinea = aerolinea; 
		this.tipodeAvion = tipodeAvion; 
		}

	public void aterrizar() {
		System.out.println("El Avión se encuentra autorizado para aterrizar");

		}

	public String getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	public String getMarca() {
		return marca;
	}

	public String getTipodeAvion() {
		return tipodeAvion;
	}
}
