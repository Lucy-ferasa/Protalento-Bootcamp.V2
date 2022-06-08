package clase6.oop;

public class Buscador {
	
	//atributos
	//modificadores
	private String claveBusqueda;
	private Articulo[] resultados;

	Buscador() {

	}

	void buscar() {
		System.out.println("buscando..." + this.claveBusqueda);

		// como mi buscador necesita usar un objeto de la clase DB
		// debe instanciar un objeto de dicha clase
		DB db = new DB();

		this.resultados = db.consultar(claveBusqueda);
	}
	/*
	void definirClaveBusqueda(String clave) {
		claveBusqueda = clave;
	}
	*/
	
	//alt+shift+s
	
	
		void mostrarResultados() {
		if(this.resultados.length > 0) {
			for(Articulo aux : this.resultados ) {
				aux.detalleArticulo();
			}
		}else {
			System.out.println("No hay resultados para " + this.claveBusqueda);
		}
	}
}