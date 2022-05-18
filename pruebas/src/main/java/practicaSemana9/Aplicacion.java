package practicaSemana9;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		
		System.out.println("Inscripción de materias 2022:");
		
		Scanner teclado = new Scanner(System.in); 
		
		DatosDBMemoria datos = new DatosDBMemoria(); 
		
		Materia[] materias = crearMaterias(teclado);
		System.out.println("Materias disponibles: ");
		for(Materia materia : materias) {
			System.out.println((materia));
		}
		System.out.println("--------------------------");
		
		// 2. se crean los alumnos que van a poder inscribir materias pues estan matriculados

		Alumno[] alumnos = crearAlumnos(teclado);
		System.out.println("Alumnos matriculados: ");
		for(Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
		System.out.println("--------------------------");
		// 3. se da al cliente las opciones del menu para que inscriban,
		// eliminen o busquen una inscripcion
		
		int seleccion = opciones(teclado);
		
		MenuCrudImpl crud = new MenuCrudImpl();
		
		while(seleccion == 1 || seleccion == 2 || seleccion == 3 || seleccion == 0) {
			if(seleccion == 1) {
				System.out.println("Ejecutando Inscripcion");
				Inscripcion inscripcion;
				try {
					inscripcion = crud.inscribir(teclado);
					datos.agregarInscripcion(inscripcion);
					System.out.println("La inscripción de id " + inscripcion.getIdInscripcion() + " fue exitosa.");
				} catch (InscripcionYaExisteException e) {
					e.printStackTrace();
				} finally {
					seleccion = opciones(teclado);
				}
			} else if(seleccion == 2) {	
				System.out.println("Ejecutando Eliminar inscripcion");
				crud.eliminar(teclado,datos);
				seleccion = opciones(teclado);
			} else if(seleccion == 3) {
				System.out.println("Ejecutando Buscar inscripcion");
				crud.buscar(teclado,datos);
				seleccion = opciones(teclado);
			} else if (seleccion == 0){
				System.out.println("Saliendo.");
				seleccion = 5;
			}
		}
		teclado.close();
	}

	public static int opciones(Scanner teclado) {
		System.out.println("Por favor elija una de las opciones del menu: ");
		System.out.println("1- Inscribir" + "\n"
				+ "2- Eliminar inscripcion" + "\n"
				+ "3- Buscar inscripcion" + "\n"
				+ "0 - Salir");
		int seleccion = teclado.nextInt();
		return seleccion;
	}
	
	public static Materia[] crearMaterias(Scanner teclado) {
		System.out.println("\n" + "Ingreso de materias al sistema: " + "\n");
		
		System.out.println("Por favor ingrese la cantidad de materias disponibles: ");
		int cantidadMaterias = teclado.nextInt();
		
		Materia[] materias = new Materia[cantidadMaterias];
		
		for(int i = 0; i < cantidadMaterias; i++) {
			System.out.println("Por favor ingrese el id único de la materia: ");
			Long idMateria = teclado.nextLong();
			
			System.out.println("Por favor ingrese el nombre del curso: ");
			String curso = teclado.next();
			
			System.out.println("Por favor ingrese si el turno del curso es Diurno o Nocturno ");
			String turno = teclado.next();
			
			Materia materiaTemp = new Materia(idMateria,curso,turno);
			
			if(i == 0) {
				materias[i] = materiaTemp;
				System.out.println("\n" + "Materia agregada: " + materias[i] + "\n");
			} else {
				int repeticiones = 0;
				for(int j = 0; j < i; j++) {
					if(idMateria == materias[j].getId()) {
						repeticiones++;
						i--;
					}
				} 
				if(repeticiones == 0) {
					materias[i] = materiaTemp;
					System.out.println("\n" + "Materia agregada: " + materias[i] + "\n");
				} else {
					System.out.println("\n" + "Id " + idMateria + " ya en uso. Inténtelo de nuevo." + "\n");
				}
			}
		}
		return materias;
	}
	
	public static Alumno[] crearAlumnos(Scanner teclado) {
		System.out.println("\n" + "Ingreso de alumnos al sistema: " + "\n");
		
		System.out.println("Por favor ingrese la cantidad de alumnos que inscribirán materias: ");
		int cantidadAlumnos = teclado.nextInt();
		
		Alumno[] alumnos = new Alumno[cantidadAlumnos];
		
		for(int i = 0; i < cantidadAlumnos; i++) {
			System.out.println("Por favor ingrese el número único de matricula del alumno a crear: ");
			Long matricula = teclado.nextLong();
			
			System.out.println("Por favor ingrese el nombre del alumno: ");
			String nombre = teclado.next();
			
			System.out.println("Por favor ingrese el apellido del alumno: ");
			String apellido = teclado.next();
			
			Alumno alumnoTemp = new Alumno(matricula,nombre,apellido);
			
			if(i == 0) {
				alumnos[i] = alumnoTemp;
				System.out.println("\n" + "Alumno agregado: " + alumnos[i] + "\n");
			} else {
				int repeticiones = 0;
				for(int j = 0; j < i; j++) {
					if(matricula == alumnos[j].getIdMatriculaAlumno()) {
						repeticiones++;
						i--;
					}
				} 
				if(repeticiones == 0) {
					alumnos[i] = alumnoTemp;
					System.out.println("\n" + "Alumno agregado: " + alumnos[i] + "\n");
				} else {
					System.out.println("\n" + "Matricula " + matricula + " ya en uso. Inténtelo de nuevo." + "\n");
				}
			}
		}
		return alumnos;
	}
		
		

	}

