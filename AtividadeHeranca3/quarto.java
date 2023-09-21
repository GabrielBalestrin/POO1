package AtividadeHeranca3;
//ATIVIDADE 8 -PDF 3
public class quarto extends Ambiente {
	private int capacidade;
	
	  public quarto(float area, int capacidade) {
	        super(area);
	        setCapacidade(capacidade);
	    }

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("quarto [capacidade=");
		builder.append(capacidade);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}


	

}
