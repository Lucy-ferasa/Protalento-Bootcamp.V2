package practicaSemana9;

public class Materia {

	private Long idMateria; 
	private String curso; 
	private String turno; 
	
	
	public Materia(Long id, String curso, String turno) {
		this.idMateria = id;
		this.curso = curso; 
		this.turno = turno; 
	}
	
	public Materia(String curso, String turno) {
		this.curso = curso; 
		this.turno = turno; 
	}

	
	public Long getId() {
		return idMateria;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Materia [id=" + idMateria + ", curso=" + curso + ", turno=" + turno + "]";
	}
	
	
	
}
