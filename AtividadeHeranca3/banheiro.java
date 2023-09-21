package AtividadeHeranca3;
//ATIVIDADE 8 -PDF 3
public class banheiro extends Ambiente {
	
	private boolean banheira;
	
	public banheiro (float area, boolean banheira) {
		super(area);
		setBanheira(banheira);
	}

	public boolean isBanheira() {
		return banheira;
	}

	public void setBanheira(boolean banheira) {
		this.banheira = banheira;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("banheiro [banheira=");
		builder.append(banheira);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	

}
