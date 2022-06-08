package practicaSemana11;

import java.util.Collection;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {

	public Persona obtenerDatosPersona(Scanner teclado) {
		System.out.println("Por favor ingrese los datos de la persona: ");
		
				
		System.out.println("Ingrese el nombre: ");
		String nombre = teclado.next();
		
		System.out.println("Ingrese el apellido: ");
		String apellido = teclado.next();
		
		String idiomaNativoStr;
		
		
		Set<String> lenguajes = new HashSet<>();
		
		
		lenguajes.add("ES");
		lenguajes.add("EN");
		lenguajes.add("FR");
		lenguajes.add("DE");
		
		do {
			System.out.println("Ingrese el idioma nativo: "
					+ "\n" + "ES - Español"
					+ "\n" + "EN - Ingles"
					+ "\n" + "FR - Frances"
					+ "\n" + "DE - Aleman");
		
		idiomaNativoStr = teclado.next();
		} while (!lenguajes.contains(idiomaNativoStr));
		
		
		IdiomasEnum idiomaEnum = IdiomasEnum.valueOf(idiomaNativoStr);
		
		
		IIdioma idiomaNativo = idiomaEnum.getIdioma();
		
		
		Persona persona = new Persona(nombre, apellido, idiomaNativo);
		
		return persona;
	}
	public IIdioma obtenerIdiomaAAprender(Scanner teclado) {
		String idiomaAAprender;
		
		
		Set<String> lenguajes = new HashSet<>();
				
		
		lenguajes.add("ES");
		lenguajes.add("EN");
		lenguajes.add("FR");
		lenguajes.add("DE");
				
		do {
			System.out.println("Ingrese el idioma a aprender: "
					+ "\n" + "ES - Español"
					+ "\n" + "EN - Ingles"
					+ "\n" + "FR - Frances"
					+ "\n" + "DE - Aleman");
				
		idiomaAAprender = teclado.next();
		} while (!lenguajes.contains(idiomaAAprender));
		
		
		IdiomasEnum idiomaEnum = IdiomasEnum.valueOf(idiomaAAprender);
				
		
		IIdioma iIdiomaAAprender = idiomaEnum.getIdioma();
		
		
		return iIdiomaAAprender;
	}
	public void hablar(Persona persona, Scanner teclado) {
		String idiomaAHablar;

		
		Set<String> lenguajes = new HashSet<>();
				
		
		lenguajes.add("ES");
		lenguajes.add("EN");
		lenguajes.add("FR");
		lenguajes.add("DE");
				
		do {
			System.out.println("Ingrese el idioma a hablar: "
					+ "\n" + "ES - Español"
					+ "\n" + "EN - Ingles"
					+ "\n" + "FR - Frances"
					+ "\n" + "DE - Aleman");
				
		idiomaAHablar = teclado.next();
		} while (!lenguajes.contains(idiomaAHablar));
		
		
		IdiomasEnum idiomaEnum = IdiomasEnum.valueOf(idiomaAHablar);
						
		
		IIdioma iIdiomaAHablar = idiomaEnum.getIdioma();
		
				boolean loHabla = false;
				if(persona.getIdiomaNativo().getClass().getSimpleName() != iIdiomaAHablar.getClass().getSimpleName()) {
					
					Collection<IIdioma> idiomasQueAprendio = persona.getIdiomasAprendidos();
					for(IIdioma _idioma : idiomasQueAprendio) {
						if(_idioma.getClass().getSimpleName() == iIdiomaAHablar.getClass().getSimpleName()) {
							loHabla = true;
							break;
						} 
					}
				} else {
					loHabla = true;
				}
				if(loHabla) {
					persona.saludarEn(iIdiomaAHablar);
					persona.presentarseEn(iIdiomaAHablar);
					persona.despedirseEn(iIdiomaAHablar);
				}
			}

			public Collection<Persona> obtenerPersonasQueHablanUnIdioma(Map<Integer,Persona> personas,Scanner teclado) {
				
				String idiomaABuscar;
				
				
				Set<String> lenguajes = new HashSet<>();
						
				lenguajes.add("ES");
				lenguajes.add("EN");
				lenguajes.add("FR");
				lenguajes.add("DE");
						
				do {
					System.out.println("Ingrese el idioma a buscar: "
							+ "\n" + "ES - Español"
							+ "\n" + "EN - Ingles"
							+ "\n" + "FR - Frances"
							+ "\n" + "DE - Aleman");
						
				idiomaABuscar = teclado.next();
				} while (!lenguajes.contains(idiomaABuscar));
				
				
				IdiomasEnum idiomaEnum = IdiomasEnum.valueOf(idiomaABuscar);
								
				IIdioma iIdiomaABuscar = idiomaEnum.getIdioma();
				
				Collection<Persona> personasQueSabenUnIdioma = new ArrayList<>();
				
				Set<Map.Entry<Integer, Persona>> entrySet = personas.entrySet();
				
				for(Map.Entry<Integer, Persona> entry : entrySet) {
					Persona personaAux = entry.getValue();
					
					
					if(personaAux.getIdiomaNativo().getClass().getSimpleName() == iIdiomaABuscar.getClass().getSimpleName()) {
						personasQueSabenUnIdioma.add(personaAux);
					}
					
					Set<IIdioma> idiomasAprendidosPorPersona = (Set<IIdioma>) personaAux.getIdiomasAprendidos();
					//recorremos
					for(IIdioma _idioma : idiomasAprendidosPorPersona) {
						if(_idioma.getClass().getSimpleName() == iIdiomaABuscar.getClass().getSimpleName()) {
							personasQueSabenUnIdioma.add(personaAux);
						}
					}
				
				}
				return personasQueSabenUnIdioma;
			}
		}







