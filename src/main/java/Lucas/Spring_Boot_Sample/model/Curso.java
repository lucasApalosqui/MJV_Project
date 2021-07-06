package Lucas.Spring_Boot_Sample.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_curso")
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_curso")
	private Integer id;
	@Column(length = 20, nullable = false, name = "nomeCurso")
	private String nome;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_departamento", foreignKey = @ForeignKey(name = "fk_departamento_curso"))
	private Departamento departamento;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Integer getId() {
		return id;
	}
	
}
