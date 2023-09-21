package AtividadeHeranca2;
//ATIVIDE 4 PDF 2
public class veiculo {
	private boolean motor;

	public veiculo (boolean motor) {
		setMotor(motor);
	}

	public boolean getMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("veiculo [motor=");
		builder.append(motor);
		builder.append("]");
		return builder.toString();
	}

	
}
