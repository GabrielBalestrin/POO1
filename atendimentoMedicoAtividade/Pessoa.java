package atendimentoMedicoAtividade;

public class Pessoa {

	private String nome;
	private String dataNasc;

	public Pessoa(String nome, String dataNasc) {
		setNome(nome);
		setDataNasc(dataNasc);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", dataNasc=");
		builder.append(dataNasc);
		builder.append("]");
		return builder.toString();
	}
	
	

}
