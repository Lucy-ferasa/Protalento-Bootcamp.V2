package practicaSemana9;

public class Alumno {

	private Long idMatriculaAlumno; 
	private String nombre;
	private String apellido; 
	
	
	public Alumno(Long idMatriculaAlumno, String nombre, String apellido) {
		this.idMatriculaAlumno = idMatriculaAlumno; 
		this.nombre = nombre; 
		this.apellido = apellido; 
		
	}
	
	public Alumno(String nombre, String apellido) {
		this.nombre = nombre; 
		this.apellido = apellido; 
		
	}

	public Long getIdMatriculaAlumno() {
		return idMatriculaAlumno; 
	}
	
	public String getNombre() {
		return nombre; 
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido; 
	}
	
	@Override
	public String toString() {
		return "Alumno [idAlumno=" + idMatriculaAlumno + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
}
