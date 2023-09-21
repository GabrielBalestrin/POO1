package AtividadeHeranca;
//ATIVIDADE 2 PDF 1
public class livro extends item {
	
	private String autor;
	public livro( int codigo, String descricao) {
		super(codigo, descricao);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("livro [autor=");
		builder.append(autor);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
