package practicaSemana3;

import java.util.Scanner; 

public class practicaNotas {
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Por favor ingrese la cantidad de alumnos a procesar: ");
		int cantAlumnos = teclado.nextInt();

		System.out.println("Por favor ingrese el número de exámenes hechos durante el periodo: ");
		int cantExamenes = teclado.nextInt();

		int cantidadColumnas = (cantExamenes*2)+2;

	
		Object [][] datosAlumnos = new Object [cantAlumnos][cantidadColumnas];

		for (int i = 0; i<cantAlumnos; i++) {
			for (int j = 0; j < cantidadColumnas; j++) {

				if (j == 0) {
					System.out.println("Por favor ingrese el nombre del estudiante: ");
					datosAlumnos[i][j] = teclado.next();
				}

				if (j == 1) {
					System.out.println("Por favor ingrese el apellido del estudiante: ");
					datosAlumnos[i][j] = teclado.next();
				}
				if (j % 2 == 0 && j != 0) {
					System.out.println("Por favor ingrese el numero del examen: ");
					datosAlumnos[i][j] = teclado.nextDouble();
				}
				if (j % 2 != 0 && j != 1) {
					System.out.println("Por favor ingrese la nota del examen (entre 0 y 10 inclusive)");
					datosAlumnos[i][j] = teclado.nextDouble();
				}

			}

		}

		// ALUMNO CON LA CALIFICACIÓN MÁS BAJA

				String alumnoCalifMenor = datosAlumnos[0][0].toString() + " " + datosAlumnos[0][1].toString();
				double menorCalif = (Double)datosAlumnos[0][3];

				for (int i = 0; i< cantAlumnos; i++) {
					for (int j = 3; j < cantidadColumnas; j+=2) {
						if ((Double)datosAlumnos[i][j] < menorCalif) {
							menorCalif = (Double)datosAlumnos[i][j];
							alumnoCalifMenor = datosAlumnos[i][0].toString() + " " + datosAlumnos[i][1].toString();
						}
					}
				}

				System.out.println("El alumno con menor calificación es: " + alumnoCalifMenor 
						+ " con calificación: " + menorCalif);


				// PROMEDIO 


				Object [][] matrizpromedios = new Object [cantAlumnos][2];

				for (int i = 0; i < cantAlumnos; i++) {
					double suma = 0;
					double promedio = 0;
					for (int j= 3; j < cantidadColumnas; j+=2) {
						suma += (Double)datosAlumnos[i][j];
					}
					promedio = suma/cantExamenes;
					matrizpromedios[i][0] = datosAlumnos[i][0].toString() + " " + datosAlumnos[i][1].toString();
					matrizpromedios[i][1] = promedio;
				}


				// ALUMNOS QUE PROMOCIONAN : 

				System.out.println("Alumnos que promocionan: ");
				for (int i = 0; i < cantAlumnos; i++) {
					if ((Double)matrizpromedios[i][1] >= 7) {
						System.out.println(matrizpromedios[i][0] + " con un promedio de: " + matrizpromedios[i][1]);
					}
				}

				// ALUMNOS QUE DEBEN RECURSAR LA MATERIA : 

				System.out.println("Alumnos que deben recursar la materia: ");
				for (int i = 0; i < cantAlumnos; i++) {
					if ((Double)matrizpromedios[i][1] < 7) {
						System.out.println(matrizpromedios[i][0] + " con un promedio de: " + matrizpromedios[i][1]);
					}

				}	



	teclado.close();



		}

	 
	}


