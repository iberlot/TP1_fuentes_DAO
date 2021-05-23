package edu.usal.negocio.factory;

import edu.usal.negocio.dao.AlumnoDAO;
import edu.usal.negocio.dao.AlumnoDAOImpl;

public class AlumnoFactory {
	
	public static AlumnoDAO getAlumnoDAO(String imple) {
		return new AlumnoDAOImpl();
	}

}
