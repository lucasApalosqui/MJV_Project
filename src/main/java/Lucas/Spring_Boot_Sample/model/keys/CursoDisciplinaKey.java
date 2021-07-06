package Lucas.Spring_Boot_Sample.model.keys;
import java.io.Serializable;
import javax.persistence.*;


@Embeddable
public class CursoDisciplinaKey implements Serializable{
	@Column(name = "id_curso")
	Integer idCurso;
	
	@Column(name = "id_disciplina")
	Integer idDisciplina;

	
	public Integer getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	public Integer getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(Integer idDisciplina) {
		this.idDisciplina = idDisciplina;
	}
	
	
}
