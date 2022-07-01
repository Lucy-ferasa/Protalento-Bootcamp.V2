package practicasemana15;

import java.util.Date;

public class Formulario {
	String nombre;
	String apellido;
	Long documento;
	Integer edad;
	String ocupacion;
	Date fechaNacimiento;
	
	
	
	public Formulario() {
		
	}
	
	public Formulario(String nombre, String apellido, Long documento, Integer edad, String ocupacion,
			Date fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.edad = edad;
		this.ocupacion = ocupacion;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	public Long getDocumento() {
		return documento;
	}
	public void setDocumento(Long documento) {
		this.documento = documento;
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
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	@Override
	public String toString() {
		return "Formulario [documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", ocupacion=" + ocupacion + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
}