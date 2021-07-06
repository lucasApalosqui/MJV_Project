package Lucas.Spring_Boot_Sample.model.keys;
import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class HistoricoDisciplinaKey implements Serializable{
	@Column(name = "id_historico")
	Integer idHistorico;
	
	@Column(name = "id_disciplina")
	Integer idDisciplina;
	

	public Integer getIdHistorico() {
		return idHistorico;
	}

	public void setIdHistorico(Integer idHistorico) {
		this.idHistorico = idHistorico;
	}

	public Integer getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(Integer idDisciplina) {
		this.idDisciplina = idDisciplina;
	}
	
	
	
}
