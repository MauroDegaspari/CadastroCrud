package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entidade.Endereco;
import entidade.Pessoa;
import util.JpaUtil;

public class Dados {

	public static void main(String[] args) {

		EntityManager emt = JpaUtil.getEntityManager();
		System.out.println(emt.isOpen());

		Pessoa p = new Pessoa();
		Endereco e = new Endereco();

		p.setNome("rock");
		p.setCpf("12312342712");
		e.setRua("R. da limoeiro");
		e.setBairro("graças");
		e.setCidade("olinda");
		p.setEndereco(e);

		EntityTransaction tx = emt.getTransaction();
		tx.begin();

		emt.merge(p);
		tx.commit();
		emt.close();

	}

}
