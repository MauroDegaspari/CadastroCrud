package teste;

import javax.persistence.EntityManager;

import util.JpaUtil;

public class conexao {

	public static void main(String[] args) {
		EntityManager emt = JpaUtil.getEntityManager();
		System.out.println(emt.isOpen());

	}

}
