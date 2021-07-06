package Lucas.Spring_Boot_Sample.model.keys;
import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class ProfessorDisciplinaKey implements Serializable{
	@Column(name = "cod_professor")
	Integer codProfessor;
	
	@Column(name = "id_disciplina")
	Integer idDisciplina;

	public Integer getCodProfessor() {
		return codProfessor;
	}

	public void setCodProfessor(Integer codProfessor) {
		this.codProfessor = codProfessor;
	}

	public Integer getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(Integer idDisciplina) {
		this.idDisciplina = idDisciplina;
	}
	
	
}
