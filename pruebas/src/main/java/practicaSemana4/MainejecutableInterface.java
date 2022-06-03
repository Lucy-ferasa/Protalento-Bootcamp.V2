package practicaSemana4;

public class MainejecutableInterface {

	public static void main(String[] args) {
		Avion1 a = new Avion1("Avion Neko","Boeing 787", "Latam", "Avion de Carga"); 
		Helicoptero1 h = new Helicoptero1("Helikosito", 4, "Helicoptero Civil", "morado"); 
		Superman1 s = new Superman1("Clark Kent", "azul", 250, 191); 
		OvniChirri o = new OvniChirri("El brownie no me cogió", "Triangular", "Intensa", 2); 

		Volador1[] voladores = new Volador1[] {a,h,s,o};

		for(Volador1 v : voladores) {
			if(v instanceof Aterrizable1) {

				Aterrizable1 atr = (Aterrizable1)v;

				atr.aterrizar(); 
			}else {
				System.out.println(v + " Volador no autorizado para aterrizar en la Pista");
			}


		}


	}

}
