package AtividadeHeranca2;
//ATIVIDE 4 PDF 2
public class moto extends veiculo {

	private int cilindradas;
	
	public moto (boolean motor, int cilindradas) {
		super(motor);
		setCilindradas(cilindradas);	
}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("moto [cilindradas=");
		builder.append(cilindradas);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}


}