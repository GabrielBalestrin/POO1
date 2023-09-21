package AtividadeHeranca2;
//ATIVIDE 4 PDF 2
public class Carro extends veiculo {
	
	private int portas;
	
	public Carro (boolean motor, int portas) {
		super (motor);
		setPortas(portas);
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carro [portas=");
		builder.append(portas);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
