package clase5;

import java.util.Arrays;

public class Vectores2 {

	public static void main(String[] args) {
		
		String[] nombres = new String[] {"luz","jos�","edwin","carlos","herana","samir","elsa"};//X

		//determinar la cantidad de nombres que inican con e

		//creamos el vector con dicho tama�o

		int cantidad = 0;
		for(String nombre : nombres) {
			if(nombre.startsWith("e")) {
				cantidad ++;
			}
		}

		//creo el vector nuevo con el tama�o correcto		
		String[] nombresConE = new String[cantidad];

		int pos = 0;

		for(String nombre : nombres) {
			if(nombre.startsWith("e")) {
				nombresConE[pos] = nombre;
				pos++;
			}
		}

		System.out.println(Arrays.toString(nombresConE));
	}
}