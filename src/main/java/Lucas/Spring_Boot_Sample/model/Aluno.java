package Lucas.Spring_Boot_Sample.model;
import javax.persistence.*;


@Entity
@Table(name = "tbl_aluno")
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ra")
	private Integer ra;
	@Column(length = 30, nullable = false, name = "nomeAluno")
	private String nome;
	@Column(length = 60, nullable = false, name = "sobrenomeAluno")
	private String sobrenome;
	@Column(length = 14, nullable = false)
	private String cpf;
	@Column(length = 9, nullable = false)
	private String rg;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_contato", foreignKey = @ForeignKey(name = "fk_contato_aluno"))
	private Contato contato;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_endereco", foreignKey = @ForeignKey(name = "fk_endereco_aluno"))
	private Endereco endereco;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_curso", foreignKey = @ForeignKey(name = "fk_curso_aluno"))
	private Curso curso;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_turma", foreignKey = @ForeignKey(name = "fk_turma_aluno"))
	private Turma turma;
	
	@OneToMany(mappedBy = "aluno")
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
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
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	public Integer getRa() {
		return ra;
	}
	
	
	
	
}
