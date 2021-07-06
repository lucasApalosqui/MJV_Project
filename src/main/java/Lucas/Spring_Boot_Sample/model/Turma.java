package Lucas.Spring_Boot_Sample.model;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import Lucas.Spring_Boot_Sample.model.support_classes.Periodo;

@Entity
@Table(name = "tbl_turma")
public class Turma {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_turma")
	private Integer id;
	@Column(name = "nomeTurma", nullable = false, length = 20)
	private String nome;
	@Enumerated(EnumType.STRING)
	private Periodo periodo; //M: MANHÃ, T: TARDE, N: NOITE
	@Column(length = 10, nullable = false)
	private Long numAluno;
	@Column(name = "data_inicio", nullable = false)
	private LocalDate dataInicio;
	@Column(name = "data_fim", nullable = true)
	private LocalDate dataFim;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_turma", foreignKey = @ForeignKey(name = "fk_turma_curso"))
	private List<Curso> curso;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Periodo getPeriodo() {
		return periodo;
	}
	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}
	public Long getNumAluno() {
		return numAluno;
	}
	public void setNumAluno(Long numAluno) {
		this.numAluno = numAluno;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	public LocalDate getDataFim() {
		return dataFim;
	}
	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}
	public List<Curso> getCurso() {
		return curso;
	}
	public void setCurso(List<Curso> curso) {
		this.curso = curso;
	}
	public Integer getId() {
		return id;
	}
	
}
