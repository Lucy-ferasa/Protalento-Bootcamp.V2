package practicaSemana11;

import java.util.Collection;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

public class MainIdiomas {
		public static void main(String[] args) {
				
			Scanner teclado = new Scanner(System.in);
				
			Menu op = new Menu();
				
			System.out.println("Por favor ingrese cuantas personas son: ");
			int cantidadPersonas = teclado.nextInt();
				
			Map<Integer,Persona> personas = new HashMap<>();
				
			for(int i = 0; i < cantidadPersonas; i++) {
				Persona persona = op.obtenerDatosPersona(teclado);
				Integer codigo = Integer.valueOf(i + 1);
				personas.put(codigo,persona);
			}
				
			int opcion = 3;
				
			while(opcion != 0) {
					
				System.out.println("Por favor ingrese: "
							+ "\n" + "1 - Aprender Idioma"
							+ "\n" + "2 - Hablar"
							+ "\n" + "3 - Consultar personas que hablan un idioma"
							+ "\n" + "0 - Finalizar");
				opcion = teclado.nextInt();
				
				Set<Map.Entry<Integer, Persona>> entrySet = personas.entrySet();
				
				if(opcion == 1) {
					int codigoPersona;
					System.out.println("Elija la persona que aprenderá un idioma: ");
					
					for(Map.Entry<Integer, Persona> entry : entrySet) {
						Integer codigoAux = entry.getKey();
						Persona personaAux = entry.getValue();
						String nombre = personaAux.getNombre();
						String apellido = personaAux.getApellido();
						String idiomaNativo = personaAux.getIdiomaNativo().getClass().getSimpleName();
						System.out.println(codigoAux + " - Nombre completo: " + nombre + " " + apellido + ", Idioma nativo: " + idiomaNativo);
					}
						 
					codigoPersona = teclado.nextInt();
						
					Persona personaSeleccionada = personas.get(codigoPersona);
						
					IIdioma idioma = op.obtenerIdiomaAAprender(teclado);
						
										
				} else if(opcion == 2) {
					int codigoPersona;
					System.out.println("Elija la persona que hablará: ");
						
					for(Map.Entry<Integer, Persona> entry : entrySet) {
						Integer codigoAux = entry.getKey();
						Persona personaAux = entry.getValue();
						String nombre = personaAux.getNombre();
						String apellido = personaAux.getApellido();
						String idiomaNat = personaAux.getIdiomaNativo().getClass().getSimpleName();
						System.out.println(codigoAux + " - Nombre completo: " + nombre + " " + apellido + ", Idioma nativo: " + idiomaNat);
					}
						
					codigoPersona = teclado.nextInt();
						
					Persona personaSeleccionada = personas.get(codigoPersona);
					
				} else if(opcion == 3) {
					Collection<Persona> personasQueHablanIdioma = new ArrayList<>();
					personasQueHablanIdioma = op.obtenerPersonasQueHablanUnIdioma(personas,teclado);
					System.out.println("Personas que hablan el idioma: ");
					for(Persona personaAux : personasQueHablanIdioma) {
						System.out.println("Nombre completo: " + personaAux.getNombre()+" "+personaAux.getApellido());
					}
				} else if(opcion == 0) {
					System.out.println("Aplicación finalizada");
				} else {
					System.out.println("Por favor ingrese una opción correcta");
				}
			}
				
			teclado.close();
	}
}
		
		
		


