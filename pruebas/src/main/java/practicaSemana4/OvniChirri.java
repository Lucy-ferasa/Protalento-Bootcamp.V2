package practicaSemana4;

public class OvniChirri extends Volador1 {

	
	private String forma; 
	private String luminosidad; 
	private int cantidadDeAliens; 


	public OvniChirri(String nombre, String forma, String luminosidad, int cantidadDeAliens) {
		super(nombre);
		this.forma = forma;
		this.luminosidad = luminosidad;
		this.cantidadDeAliens = cantidadDeAliens;
	}


	public int getCantidadDeAliens() {
		return cantidadDeAliens;
	}


	public void setCantidadDeAliens(int cantidadDeAliens) {
		this.cantidadDeAliens = cantidadDeAliens;
	}


	public String getForma() {
		return forma;
	}


	public String getLuminosidad() {
		return luminosidad;
	}
}
