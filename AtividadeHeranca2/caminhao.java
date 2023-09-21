package AtividadeHeranca2;
//ATIVIDE 4 PDF 2
public class caminhao extends veiculo {
	private int eixos;
	
	public caminhao (boolean motor, int eixos) {
		super(motor);
		setEixos(eixos);
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("caminhao [eixos=");
		builder.append(eixos);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
