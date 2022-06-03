package practicaSemana4;

public class Superman1 extends Volador1 {

	private String colorDeOjos; 
	private int velocidad; 
	private int altura; 	


	public Superman1(String nombre, String colorDeOjos, int velocidad, int altura) {
		super(nombre);
		this.colorDeOjos = colorDeOjos;
		this.velocidad = velocidad; 
		this.altura = altura; 

	}


	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


	public String getColorDeOjos() {
		return colorDeOjos;
	}


	public int getAltura() {
		return altura;
	}

	
}
