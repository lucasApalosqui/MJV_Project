package Lucas.Spring_Boot_Sample.model;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "tbl_historico")
public class Historico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_historico")
	private Integer id;
	@Column(name = "data_inicio")
	private LocalDate dataInicio;
	@Column(name = "data_fim")
	private LocalDate dataFim;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ra", foreignKey = @ForeignKey(name = "fk_historico_aluno"))
	private Aluno aluno;
	


	
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

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Integer getId() {
		return id;
	}
	
	
	
	
}
