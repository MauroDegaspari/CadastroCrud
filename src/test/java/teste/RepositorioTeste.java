package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import util.JpaUtil;

public class RepositorioTeste {

	public static void main(String[] args) {
		EntityManager emt = JpaUtil.getEntityManager();
		System.out.println(emt.isOpen());

		//String sql = "INSERT INTO " 
		
		EntityTransaction tx = emt.getTransaction();
		tx.begin();

		//emt.merge(p);
		tx.commit();
		emt.close();
	}

}
