package Lucas.Spring_Boot_Sample.model;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Column;
@Entity
@Table(name = "tab_cadastro")
public class cadastro {
	@Id
	private Integer id;
	@Column(length = 50)
	private String nome;
	@Column(length = 11)
	private Long telefone;
	@Column(length = 70)
	private String email;
	@Column(length = 14)
	private String cpf;
}
