package com.clearminds.model;



public class PersonaManager {
	
	private ServicioPersona serv;
	
	public PersonaManager() throws InstanceException  {
		Class<?> clase = null;
		try {
			clase = Class.forName("com.clearminds.model.ServicioPersonaArchivo");
			//throw new ClassException("Con que permiso????????");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}
		try {
			serv=(ServicioPersona)clase.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}
	}
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}

}
