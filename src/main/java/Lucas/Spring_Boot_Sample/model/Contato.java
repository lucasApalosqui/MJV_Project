package Lucas.Spring_Boot_Sample.model;
import javax.persistence.*;

@Entity
@Table(name = "tbl_contato")
public class Contato {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(length = 11, nullable = true)
	private Long telefone;
	@Column(length = 11, nullable = false)
	private Long celular;
	@Column(length = 60, nullable = false)
	private String email;
	
	
	public Long getTelefone() {
		return telefone;
	}
	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}
	public Long getCelular() {
		return celular;
	}
	public void setCelular(Long celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	
	
	
}
