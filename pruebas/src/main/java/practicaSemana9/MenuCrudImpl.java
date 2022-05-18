package practicaSemana9;

import java.util.Scanner; 

public class MenuCrudImpl implements Crud {

	public Inscripcion inscribir(Scanner teclado) throws InscripcionYaExisteException {
		System.out.println("Por favor ingrese los datos del alumno a inscribir: ");
		System.out.println("Ingrese el número de matricula: ");
		Long matricula = teclado.nextLong();
			
		System.out.println("Por favor ingrese el id de la materia a la que desea inscribir al alumno: ");
		Long idMateria = teclado.nextLong();
		
		System.out.println("IdInscr");
		Long idInscripcion = teclado.nextLong();
			
		return new Inscripcion(idInscripcion,matricula,idMateria);
	}

	public void eliminar(Scanner teclado, DatosDBMemoria datos) throws InscripcionNoExisteException {
		System.out.println("Por favor indique el id de la inscripción que desea eliminar: ");
		Long idInscripcion = teclado.nextLong();
		if(datos.buscar(idInscripcion)) {
			datos.borrarInscripcion(idInscripcion);
		} else {
			throw new InscripcionNoExisteException("El id "+idInscripcion+" no existe.");
		}
		
	}

	public void buscar(Scanner teclado, DatosDBMemoria datos) {
		System.out.println("Por favor indique el id de la inscripción que desea buscar: ");
		Long idInscripcion = teclado.nextLong();
		datos.buscarInscripcion(idInscripcion);
	}
			
	}

	
