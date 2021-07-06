package Lucas.Spring_Boot_Sample.model;

import javax.persistence.*;


@Entity
@Table(name = "tbl_endereco")
public class Endereco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_endereco")
	private Integer id;
	@Column(length = 40, nullable = false)
	private String logradouro;
	@Column(length = 20, nullable = false)
	private Long numero;
	@Column(length = 30, nullable = false)
	private String bairro;
	@Column(length = 30, nullable = false)
	private String cidade;
	@Column(length = 2, nullable = false)
	private String estado;
	@Column(length = 30, nullable = true)
	private String complemento;
	@Column(length = 12, nullable = false)
	private String cep;
	
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Integer getId() {
		return id;
	}
	
	
}
