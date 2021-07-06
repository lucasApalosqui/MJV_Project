package Lucas.Spring_Boot_Sample.model.support_classes;

public enum Periodo {
	M("MANHÃ"),
	T("TARDE"),
	N("NOITE");
	
	private String nome;
	private Periodo(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
}
