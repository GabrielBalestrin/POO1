package AtividadeHeranca3;
//ATIVIDADE 9 -PDF 3
public class apollo11 extends naveEspacial {
	private String tipoCombustivel;

	public apollo11 (double velocidadeMaxima, String tipoCombustivel) {
		super(velocidadeMaxima);
		setTipoCombustivel(tipoCombustivel);
	}
	
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("apollo11 [tipoCombustivel=");
		builder.append(tipoCombustivel);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
