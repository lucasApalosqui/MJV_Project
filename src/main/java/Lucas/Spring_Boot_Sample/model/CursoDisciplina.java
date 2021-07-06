package Lucas.Spring_Boot_Sample.model;
import javax.persistence.*;

import Lucas.Spring_Boot_Sample.model.keys.CursoDisciplinaKey;

@Entity
@Table(name = "tbl_curso_disciplina")
public class CursoDisciplina {
	@EmbeddedId
	CursoDisciplinaKey id;
	
	@ManyToOne
	@MapsId("idCurso")
	@JoinColumn(name = "id_curso", foreignKey = @ForeignKey(name = "fk_curso_disciplina"))
	Curso cursoDisciplina;
	
	@ManyToOne
	@MapsId("idDisciplina")
	@JoinColumn(name = "id_disciplina", foreignKey = @ForeignKey(name = "fk_disciplina_curso"))
	Disciplina disciplinaCurso;

	public CursoDisciplinaKey getId() {
		return id;
	}

	public void setId(CursoDisciplinaKey id) {
		this.id = id;
	}

	public Curso getCursoDisciplina() {
		return cursoDisciplina;
	}

	public void setCursoDisciplina(Curso cursoDisciplina) {
		this.cursoDisciplina = cursoDisciplina;
	}

	public Disciplina getDisciplinaCurso() {
		return disciplinaCurso;
	}

	public void setDisciplinaCurso(Disciplina disciplinaCurso) {
		this.disciplinaCurso = disciplinaCurso;
	}
	
	
	
	
}
