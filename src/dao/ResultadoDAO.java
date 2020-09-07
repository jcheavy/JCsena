package dao;

import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

import entities.Resultado;
import services.ConectioFactory;

public class ResultadoDAO {
	
	public Resultado save(Resultado resultado) {
		
		EntityManager em = ConectioFactory.getConnection().createEntityManager();
		
		try {
			 	em.getTransaction().begin();
			 	em.persist(resultado);
			 	em.getTransaction().commit();
			
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, "Erro ao tentar salvar no banco "+e);
		}finally {
			em.close();
		}
		return resultado;
	}
}
