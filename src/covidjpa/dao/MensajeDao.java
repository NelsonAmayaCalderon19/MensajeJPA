package covidjpa.dao;

import javax.persistence.EntityManager;

import covidjpa.entities.Mensaje;
import covidjpa.util.Conexion;

public class MensajeDao {
	EntityManager em = null;
	
	public MensajeDao(){
		em = Conexion.getEm();
	}
	public void insertar(Mensaje mensaje){
		try {
			 em.getTransaction().begin();
			 em.persist(mensaje);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 em.close();
			 }
		
	}
	public void update(Mensaje mensaje){
		try {
			 em.getTransaction().begin();
			 em.merge(mensaje);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 em.close();
			 }
		
	}
	public void delete(Mensaje mensaje){
		try {
			 em.getTransaction().begin();
			 em.remove(mensaje);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 e.printStackTrace();
			 }finally {
			 em.close();
			 }
		
	}
}
