package AtividadeHeranca3;
//ATIVIDADE 8 -PDF 3
public class cozinha extends Ambiente {

	private boolean microondas;
	
	public cozinha (float area, boolean microondas) {
		super (area);
		setMicroondas(microondas);
	}

	public boolean isMicroondas() {
		return microondas;
	}

	public void setMicroondas(boolean microondas) {
		this.microondas = microondas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("cozinha [microondas=");
		builder.append(microondas);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
