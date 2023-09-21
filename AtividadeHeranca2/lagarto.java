package AtividadeHeranca2;

//ATIVIDADE 5 PDF 2
public class lagarto extends reptil {
	private String especie;

	public lagarto(String nome, int idade, String tipoEscamas) {
		super(nome, idade, tipoEscamas);
		setEspecie(especie);
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public boolean trocarPele() {
		if (getIdade() > 0) {
			System.out.println("Troca feita");

			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("lagarto [especie=");
		builder.append(especie);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
