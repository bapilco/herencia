package com.clearminds.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PersonaManager {

	private ServicioPersona serv;

	public PersonaManager() throws InstanceException {
		Class<?> clase = null;
		try {
			String prop = propiedad();
			clase = Class.forName("com.clearminds.model."+prop);
			// throw new ClassException("Con que permiso????????");
		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}
		try {
			serv = (ServicioPersona) clase.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}
	}

	public String propiedad() {
		try {
			Properties p = new Properties();
			p.load(new FileReader(
					"D:/BRYAN/CAPACITACIONCMC/ProyectosGIT/herencia/src/main/java/properties/config.properties"));
			String prop = p.getProperty("implementacion");
			return prop;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

	public void insertarPersona(Persona persona) {
		serv.insertar(persona);
	}

}
