package AtividadeHeranca2;
//ATIVIDADE 5 PDF 2
public class Animal {
	private String nome;
	private int idade;
	
	public Animal (String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public boolean comer () {
		if (idade > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean mover (String tipo) {
		if (tipo != null)
			return true;
		else 
			return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [nome=");
		builder.append(nome);
		builder.append(", idade=");
		builder.append(idade);
		builder.append("]");
		return builder.toString();
	}
	
	
}
