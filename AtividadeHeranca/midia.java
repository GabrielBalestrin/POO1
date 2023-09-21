package AtividadeHeranca;
//ATIVIDADE 2 PDF 1
public class midia extends item {

	private String gravadora;
	private float duracao;
	
	public midia(int codigo, String descricao, String gravadora, float duracao) {
	    super(codigo, descricao);
	    setGravadora(gravadora);
	    setDuracao(duracao);
	}

	
	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

	public float getDuracao() {
		return duracao;
	}

	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("midia [gravadora=");
		builder.append(gravadora);
		builder.append(", duracao=");
		builder.append(duracao);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
