package AtividadeHeranca2;

//ATIVIDADE 5 PDF 2
public class reptil extends Animal {
	private String tipoEscamas;

	public reptil(String nome, int idade, String tipoEscamas) {
		super(nome, idade);
		setTipoEscamas(tipoEscamas);
	}

	public String getTipoEscamas() {
		return tipoEscamas;
	}

	public void setTipoEscamas(String tipoEscamas) {
		this.tipoEscamas = tipoEscamas;
	}

	public boolean botarOvos() {
		if (getIdade() > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("reptil [tipoEscamas=");
		builder.append(tipoEscamas);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
