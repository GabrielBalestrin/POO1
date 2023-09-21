package AtividadeHeranca2;
//ATIVIDADE 5 PDF 2
public class mamifero extends Animal {

	private String pelagem;
	
	public mamifero (String nome, int idade, String pelagem) {
		super (nome, idade);
		setPelagem(pelagem);
	}

	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}

	public boolean amamentar () {
		if (getIdade() > 0) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("mamifero [pelagem=");
		builder.append(pelagem);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
