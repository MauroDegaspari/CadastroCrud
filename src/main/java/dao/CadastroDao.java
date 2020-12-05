package dao;

import java.util.List;

import entidade.Endereco;



public interface CadastroDao {

	public boolean inserirCadastro(Endereco endereco);
	
	public boolean alterarCadastro(Endereco endereco);
	
	public boolean removerCadastro(Endereco endereco);
	
	public Endereco pesquisarCadastro(int id);
	
	public List<Endereco> pesquisarCadastro(Endereco endereco);
	
}
