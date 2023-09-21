package AtividadeHeranca;
//ATIVIDADE 2 PDF 1
public class vhs extends midia {

	private String titulo;
	
	public vhs (int codigo, String descricao, String gravadora, float duracao) {
		super(codigo,descricao,gravadora,duracao);
		setTitulo(titulo);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("vhs [titulo=");
		builder.append(titulo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
