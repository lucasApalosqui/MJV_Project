package Lucas.Spring_Boot_Sample.model;
import javax.persistence.*;

import Lucas.Spring_Boot_Sample.model.keys.ProfessorDisciplinaKey;

@Entity
@Table(name = "tbl_professor_disciplina")
public class ProfessorDisciplina {
	@EmbeddedId
	ProfessorDisciplinaKey id;
	
	@ManyToOne
	@MapsId("codProfessor")
	@JoinColumn(name = "cod_professor", foreignKey = @ForeignKey(name = "fk_professor_disciplina"))
	Professor professorDisciplina;
	
	@ManyToOne
	@MapsId("idDisciplina")
	@JoinColumn(name = "id_disciplina", foreignKey = @ForeignKey(name = "fk_disciplina_professor"))
	Disciplina disciplinaProfessor;

	
	public ProfessorDisciplinaKey getId() {
		return id;
	}

	public void setId(ProfessorDisciplinaKey id) {
		this.id = id;
	}

	public Professor getProfessorDisciplina() {
		return professorDisciplina;
	}

	public void setProfessorDisciplina(Professor professorDisciplina) {
		this.professorDisciplina = professorDisciplina;
	}

	public Disciplina getDisciplinaProfessor() {
		return disciplinaProfessor;
	}

	public void setDisciplinaProfessor(Disciplina disciplinaProfessor) {
		this.disciplinaProfessor = disciplinaProfessor;
	}
	
	
	
}
