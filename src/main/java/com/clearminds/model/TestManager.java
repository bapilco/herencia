package com.clearminds.model;

public class TestManager {
	public static void main(String[] args) {
		Persona per = new Persona("Beyan","Pilco",23);
		PersonaManager  manager = new PersonaManager();
		manager.insertarPersona(per);
	}
}
