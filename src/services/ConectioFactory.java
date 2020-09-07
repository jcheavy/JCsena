package services;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConectioFactory {
	private static final String PERSISTENCE_UNIT_NAME = "JCsena";
	private static EntityManagerFactory factoryInstance;
	
	public static EntityManagerFactory getConnection() {
		if(factoryInstance == null) {
			factoryInstance = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		return factoryInstance;
	}
}
