package Lucas.Spring_Boot_Sample.model;


import javax.persistence.*;

import Lucas.Spring_Boot_Sample.model.keys.AlunoDisciplinaKey;

@Entity
@Table(name = "tbl_aluno_disciplina")
public class AlunoDisciplina {
	@EmbeddedId
	AlunoDisciplinaKey id;
	
	@ManyToOne
	@MapsId("raAluno")
	@JoinColumn(name = "ra_aluno")
	Aluno aluno;
	
	@ManyToOne
	@MapsId("idDisciplina")
	@JoinColumn(name = "id_disciplina")
	Disciplina disciplina;

	public AlunoDisciplinaKey getId() {
		return id;
	}

	public void setId(AlunoDisciplinaKey id) {
		this.id = id;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	
}
