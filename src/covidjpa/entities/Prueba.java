package covidjpa.entities;

import covidjpa.dao.MensajeDao;

public class Prueba {
	public static void main(String[] args) {
		
		 Mensaje m = new Mensaje();
		 m.setNombre("Eduardo");
		 m.setEmail("Eduardo@gmail.com");
		 m.setWebsite("www.google.com");
		 m.setMensaje("Hola que tal");
		 
		 //EntityManager em = Conexion.getEm();
		 MensajeDao mdao = new MensajeDao();
		 mdao.insertar(m);
		 }
}
