package practicaSemana9;

public class Inscripcion {

	private Long idRegistroInscripcion; 
	private Long idMatriculaAlumno; 
	private Long idMateria; 
	
	public Inscripcion(Long idAlumno, Long idMateria) {
		this.idMatriculaAlumno = idAlumno;
		this.idMateria = idMateria;
	}

	public Inscripcion(Long idInscripcion, Long idAlumno, Long idMateria) {
		this.idRegistroInscripcion = idInscripcion;
		this.idMatriculaAlumno = idAlumno;
		this.idMateria = idMateria;
	}
	
	
	public Long getIdInscripcion() {
		return idRegistroInscripcion;
	}
	
	public Long getIdAlumno() {
		return idMatriculaAlumno;
	}

	public void setIdAlumno(Long idAlumno) {
		this.idMatriculaAlumno = idAlumno;
	}

	public Long getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(Long idMateria) {
		this.idMateria = idMateria;
	}

	@Override
	public String toString() {
		return "Inscripcion [idInscripcion=" + idRegistroInscripcion + ", idAlumno=" + idMatriculaAlumno + ", idMateria=" + idMateria
				+ "]";
	}
	
}
