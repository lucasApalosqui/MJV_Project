package Lucas.Spring_Boot_Sample.model;
import javax.persistence.*;

@Entity
@Table(name = "tbl_professor")
public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_professor")
	private Integer cod;
	@Column(length = 30, name = "nomeProfessor", nullable = false)
	private String nomeProf;
	@Column(length = 60, name = "sobrenomeProfessor", nullable = false)
	private String sobrenomeProf;
	@Column(length = 9, nullable = false)
	private String rg;
	@Column(length = 14, nullable = false)
	private String cpf;
	@Column(length = 13, name = "numCarteira", nullable = false)
	private String numCarteira;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_contato", foreignKey = @ForeignKey(name = "fk_contato_professor"))
	private Contato contato;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_endereco", foreignKey = @ForeignKey(name = "fk_endereco_professor"))
	private Endereco endereco;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_departamento", foreignKey = @ForeignKey(name = "fk_departamento_professor"))
	private Departamento departamento;

	
	public String getNomeProf() {
		return nomeProf;
	}

	public void setNomeProf(String nomeProf) {
		this.nomeProf = nomeProf;
	}

	public String getSobrenomeProf() {
		return sobrenomeProf;
	}

	public void setSobrenomeProf(String sobrenomeProf) {
		this.sobrenomeProf = sobrenomeProf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNumCarteira() {
		return numCarteira;
	}

	public void setNumCarteira(String numCarteira) {
		this.numCarteira = numCarteira;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Integer getCod() {
		return cod;
	}
	
	
	
	
}
