package com.clearminds.model;

public class ServicioPersonaBDD implements ServicioPersona{

	public boolean insertar(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("Insertando Persona en la BDD");
		System.out.println(persona);
		return true;
	}

	public boolean actualizar(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando Persona en la BDD");
		System.out.println(persona);
		return true;
	}

	public boolean eliminar(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando Persona en la BDD");
		System.out.println(persona);
		return true;
	}

}
