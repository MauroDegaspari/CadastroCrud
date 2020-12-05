package entidade;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PESSOA")
public class Pessoa {

	@Column(name = "NOME", nullable = false)
	private String nome;

	@Id
	@Column(name = "CPF", nullable = false)
	private String cpf;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_ENDERECO", referencedColumnName = "ID_ENDERECO", nullable = false)
	private Endereco endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
