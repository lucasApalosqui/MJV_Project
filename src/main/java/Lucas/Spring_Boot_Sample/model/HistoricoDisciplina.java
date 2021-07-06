package Lucas.Spring_Boot_Sample.model;
import javax.persistence.*;
import Lucas.Spring_Boot_Sample.model.keys.HistoricoDisciplinaKey;

@Entity
@Table(name = "tbl_historico_disciplina")
public class HistoricoDisciplina {
	@EmbeddedId
	HistoricoDisciplinaKey id;
	
	@ManyToOne
	@MapsId("idHistorico")
	@JoinColumn(name = "id_historico", foreignKey = @ForeignKey(name = "fk_historico_disciplina"))
	Historico historicoDisciplina;
	
	@ManyToOne
	@MapsId("idDisciplina")
	@JoinColumn(name = "id_disciplina", foreignKey = @ForeignKey(name = "fk_disciplina_historico"))
	Disciplina disciplinaHistorico;
	
	@Column(length = 4, name = "média", nullable = false)
	private Long media;
	
	@Column(length = 10, name = "frequencia", nullable = false)
	private Long frequencia;
	

	public HistoricoDisciplinaKey getId() {
		return id;
	}

	public void setId(HistoricoDisciplinaKey id) {
		this.id = id;
	}

	public Long getMedia() {
		return media;
	}

	public void setMedia(Long media) {
		this.media = media;
	}

	public Long getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(Long frequencia) {
		this.frequencia = frequencia;
	}

	public Historico getHistoricoDisciplina() {
		return historicoDisciplina;
	}

	public void setHistoricoDisciplina(Historico historicoDisciplina) {
		this.historicoDisciplina = historicoDisciplina;
	}

	public Disciplina getDisciplinaHistorico() {
		return disciplinaHistorico;
	}

	public void setDisciplinaHistorico(Disciplina disciplinaHistorico) {
		this.disciplinaHistorico = disciplinaHistorico;
	}
	
	
	
}
