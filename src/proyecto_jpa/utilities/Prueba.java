package proyecto_jpa.utilities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Prueba {
public static void main (String[] args){
		
		Mensaje m = new Mensaje();
		m.setNombre("Nelson");
		m.setEmail("nelson@gmail.com");
		m.setWebsite("www.google.com");
		m.setMensaje("Hola");
		EntityManagerFactory emf = 
		Persistence.createEntityManagerFactory("proyecto_jpa");
		EntityManager em = emf.createEntityManager();
		try{
			em.getTransaction().begin();
			em.persist(m);
			em.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			em.close();
		}
	}
}
