package Lucas.Spring_Boot_Sample.model;
import javax.persistence.*;
@Entity
@Table(name = "tbl_disciplina")
public class Disciplina {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_disciplina")
	private Integer id;
	@Column(length = 20, nullable = false, name = "nomeDisciplina")
	private String nome;
	@Column(length = 100, nullable = false, name = "descrição")
	private String descricao;
	@Column(length = 5, nullable = false)
	private Long numAlunos;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_departamento", foreignKey = @ForeignKey(name = "fk_departamento_disciplina"))
	private Departamento departamento;
	
	@OneToMany(mappedBy = "disciplina", fetch = FetchType.LAZY)
	
	

	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Long getNumAlunos() {
		return numAlunos;
	}
	public void setNumAlunos(Long numAlunos) {
		this.numAlunos = numAlunos;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public Integer getId() {
		return id;
	}

	
}
