package dao;

import java.util.ArrayList;
import java.util.List;

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
			JOptionPane.showMessageDialog(null, "Erro ao tentar salvar no banco " + e);
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		return resultado;
	}

	public Resultado update(Resultado resultado) {

		EntityManager em = ConectioFactory.getConnection().createEntityManager();

		try {
			em.getTransaction().begin();
			if (resultado.getId() == null) {
				em.persist(resultado);
			} else {
				em.merge(resultado);
			}
			em.getTransaction().commit();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao tentar salvar no banco " + e);
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		return resultado;
	}
	
	public Resultado findById(Integer id) {
		
		EntityManager em = ConectioFactory.getConnection().createEntityManager();
		Resultado resultado = null;
		try {
			resultado = em.find(Resultado.class, id);
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao tentar salvar no banco " + e);
			em.getTransaction().rollback();
		}finally {
			em.clear();
		}
	 return resultado;
	}
	
	public List<Resultado> findAll(){
		
		EntityManager em = ConectioFactory.getConnection().createEntityManager();
		List<Resultado> resultados = new ArrayList<Resultado>();
		try {
			 resultados = em.createQuery("FROM Resultado resultado").getResultList();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro"+e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
	return resultados;
	}
	
	public Resultado remove(Integer id) {
		EntityManager em = ConectioFactory.getConnection().createEntityManager();
		Resultado resultado = null;
		try {
			resultado = em.find(Resultado.class, id);
			em.getTransaction().begin();
			em.remove(resultado);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro "+e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
	 return resultado;
	}
	
	
	
	
	
	
	
	
	
}
