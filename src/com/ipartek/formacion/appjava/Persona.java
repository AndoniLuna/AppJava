package com.ipartek.formacion.appjava;
/**
 * Clase de tipo POJO para instanciar objetos que representan una Persona
 * Los atributos de una Persona:
 * <ol>
 * 	<li><code>String</code> nombre</li>
 * 	<li><code>String</code> apellido1</li>
 * 	<li><code>String</code> apellido2</li>
 * 	<li><code>int</code> nota</li>
 * 	<li><code>boolean</code> aceptado</li>
 * 	<li><code>String</code> email</li>
 * 	<li><code>String</code> dni</li>
 * </ol>
 * @author Andoni Luna Moreno
 *
 */
public class Persona {
	//Constantes para el rango de las notas
	public static final int NOTA_MINIMA=0;
	public static final int NOTA_ACEPTADO=5;
	public static final int NOTA_MAXIMA=10;
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int nota;
	//private boolean aceptado; Eliminamos este atributo ya que es redundante
	private String email;
	private String dni;
	/**
	 * Constructor de la clase Persona al que hay que pasar obligatoriamente 3 campos:
	 * <ul>
	 * 	<li><code>String</code> nombre</li>
	 * 	<li><code>String</code> apellido1</li>
	 * 	<li><code>String</code> dni</li>
	 * </ul>
	 * Tiene como campos opcionales:
	 * <ul>
	 * 	<li><code>String</code> apellido2</li>
	 * 	<li><code>int</code> nota</li>
	 * 	<li><code>boolean</code> aceptado</li>
	 * 	<li><code>String</code> email</li>
	 * </ul>
	 * @param nombre
	 * @param apellido1
	 * @param dni
	 */
	public Persona(String nombre, String apellido1, String dni) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = "";
		this.nota = NOTA_MINIMA;
		this.email = "";
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getNota() {
		return nota;
	}
	/**
	 * Este metodo set es especial, ya que si <code>nota</code>>10
	 * la cambia 10, pero si <code>nota</code><0 la cambia a 0
	 * @param nota <code>int</code> "nota del alumno"
	 */
	public void setNota(int nota) {
		if (nota>10){
			this.nota=10;
		}else if (nota<0){
			this.nota=0;
		}else{
			this.nota = nota;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", nota=" + nota
				+ ", aceptado=" + isAceptado() + ", email=" + email + ", dni=" + dni + "]";
	}
	public boolean isAceptado() {
		boolean dev=false;
		if (this.nota>=NOTA_ACEPTADO){
			dev=true;
		}
		return dev;
	}
}
