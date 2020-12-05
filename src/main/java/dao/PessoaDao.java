package dao;

import java.util.List;

import entidade.Pessoa;

public interface PessoaDao {

	public boolean InserirPessoa(Pessoa pessoa);
	
	public boolean AlterarPessoa(Pessoa pessoa);
	
	public boolean RemoverPessoa(Pessoa pessoa);
	
	public Pessoa PesquisarPessoa(int idcpf);
	
	public List<Pessoa> pesquisarPessoa(Pessoa pessoa);
	
}
