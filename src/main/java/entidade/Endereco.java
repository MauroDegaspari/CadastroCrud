package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ENDERECO")
public class Endereco {
	@Column(name="RUA", nullable=false)
	private String rua;
	
	@Column(name="BAIRRO", nullable=false)
	private String bairro;
	
	@Column(name="CIDADE", nullable=false)
	private String cidade;
	
	@Id
	@Column(name="ID_ENDERECO", nullable=false)
	@GeneratedValue(generator = "S_ID_ENDERECO")
	@SequenceGenerator(name="S_ID_ENDERECO", sequenceName = "S_ID_ENDERECO", allocationSize = 1)
	private int idereco;
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getIdereco() {
		return idereco;
	}
	public void setIdereco(int idereco) {
		this.idereco = idereco;
	}

}
