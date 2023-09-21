package AtividadeHeranca2;
//ATIVIDADE 5 PDF 2
public class tartaruga extends reptil {

	private String tipoCasco; 
	
	public tartaruga (String nome, int idade, String tipoEscamas) {
		super (nome,idade,tipoEscamas);
		setTipoCasco(tipoCasco);
	}

	public String getTipoCasco() {
		return tipoCasco;
	}

	public void setTipoCasco(String tipoCasco) {
		this.tipoCasco = tipoCasco;
	}
	
	public boolean moverDevagarmente() {
		if (getIdade() > 0)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("tartaruga [tipoCasco=");
		builder.append(tipoCasco);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
