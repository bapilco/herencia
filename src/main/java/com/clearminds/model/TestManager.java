package com.clearminds.model;

public class TestManager {
	public static void main(String[] args) throws InstanceException  {
		Persona per = new Persona("Bryan","Pilco",23);
		PersonaManager  manager = new PersonaManager();
		manager.insertarPersona(per);
	}
}
