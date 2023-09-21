package AtividadeHeranca2;
//ATIVIDADE 5 PDF 2
public class cao extends mamifero{
	private String raca;
	
	public cao (String nome, int idade, String pelagem, String raca) {
		super (nome,idade,pelagem);
		setRaca(raca);
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public boolean latir () {
		if (getIdade() > 0)
			return true;
		else 
			return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("cao [raca=");
		builder.append(raca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
