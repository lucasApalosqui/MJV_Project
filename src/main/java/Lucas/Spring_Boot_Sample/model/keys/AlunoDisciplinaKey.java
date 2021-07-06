package Lucas.Spring_Boot_Sample.model.keys;
import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class AlunoDisciplinaKey implements Serializable{
	@Column(name = "ra_aluno")
	Integer raAluno;
	
	@Column(name = "id_disciplina")
	Integer idDisciplina;

	public Integer getRaAluno() {
		return raAluno;
	}

	public void setRaAluno(Integer raAluno) {
		this.raAluno = raAluno;
	}

	public Integer getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(Integer idDisciplina) {
		this.idDisciplina = idDisciplina;
	}
	
}
