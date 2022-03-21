package clase3;

public class EjercicioJose {

	public static void main(String[] args) {
		//determinar dado 3 numero, cual es el mayor

		// necesito 3 
		// if
		// mostrar

		int n1 = 27;
		int n2 = 26;
		int n3 = 27;
		
		//mayor estricto
		int mayor= n1;
		if (mayor <= n2) {
			mayor = n2;
		}else if (mayor <= n3) {
				mayor = n3;
			}
		

		System.out.println(mayor);
	}
}