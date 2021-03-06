package com.clearminds.model;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: "+this.nombre+" Apellido: "+this.apellido+" Edad: "+this.edad;
	}
	
	public Persona(String nombre, String apellido, int edad){
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
