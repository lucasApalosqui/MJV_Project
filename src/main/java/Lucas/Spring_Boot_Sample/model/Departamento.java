package Lucas.Spring_Boot_Sample.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_departamento")
public class Departamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_departamento")
	private Integer id;
	@Column(length = 20, name = "funções", nullable = false)
	private String funcoes;
	
	public String getFuncoes() {
		return funcoes;
	}
	public void setFuncoes(String funcoes) {
		this.funcoes = funcoes;
	}
	public Integer getId() {
		return id;
	}
}
