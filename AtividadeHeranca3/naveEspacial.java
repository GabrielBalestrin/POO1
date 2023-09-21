package AtividadeHeranca3;
//ATIVIDADE 9 -PDF 3
public class naveEspacial {
	private double velocidadeMaxima;

	public naveEspacial (double velocidadeMaximo) {
		setVelocidadeMaxima(velocidadeMaximo);
	}
	
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("naveEspacial [velocidadeMaxima=");
		builder.append(velocidadeMaxima);
		builder.append("]");
		return builder.toString();
	}
	
}
